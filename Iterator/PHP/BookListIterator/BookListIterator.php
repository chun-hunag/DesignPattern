<?php

include_once ('BookList.php');
include_once ('Book.php');

class BookListIterator
{
    protected $bookList;
    protected $currentBook = 0;

    /**
     * @param BookList $bookList
     */
    public function __construct(BookList $bookList)
    {
        $this->bookList = $bookList;
    }

    /**
     * @return Book|null
     */
    public function getCurrentBook(): ?Book
    {
        if (($this->currentBook > 0) &&
            ($this->bookList->getBookCount() >= $this->currentBook)) {
            return $this->bookList->getBook($this->currentBook);
        }
        return null;
    }

    /**
     * @return Book|null
     */
    public function getNextBook(): ?Book
    {
        if ($this->hasNextBook()) {
            return $this->bookList->getBook(++$this->currentBook);
        } else {
            return NULL;
        }
    }

    /**
     * @return bool
     */
    public function hasNextBook(): bool
    {
        if ($this->bookList->getBookCount() > $this->currentBook) {
            return TRUE;
        } else {
            return FALSE;
        }
    }
}