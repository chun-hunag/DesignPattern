<?php

include_once ('BookListIterator.php');
include_once ('BookList.php');

class BookListReverseIterator extends BookListIterator
{
    public function __construct(BookList $bookList_in)
    {
        $this->bookList = $bookList_in;
        $this->currentBook = $this->bookList->getBookCount() + 1;
    }

    /**
     * @return Book|null
     */
    public function getNextBook(): ?Book
    {
        if ($this->hasNextBook()) {
            return $this->bookList->getBook(--$this->currentBook);
        } else {
            return NULL;
        }
    }

    /**
     * @return bool
     */
    public function hasNextBook(): bool
    {
        if (1 < $this->currentBook) {
            return TRUE;
        } else {
            return FALSE;
        }
    }
}