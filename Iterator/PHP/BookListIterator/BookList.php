<?php

include_once ('Book.php');

class BookList
{
    private $books = array();
    private $bookCount = 0;

    public function __construct() {
    }

    /**
     * @return int
     */
    public function getBookCount(): int
    {
        return $this->bookCount;
    }

    /**
     * @param int $newCount
     * @return void
     */
    private function setBookCount(int $newCount): void
    {
        $this->bookCount = $newCount;
    }

    /**
     * @param int $bookNumberToGet
     * @return Book|null
     */
    public function getBook(int $bookNumberToGet): ?Book
    {
        if ($bookNumberToGet <= $this->getBookCount()) {
            return $this->books[$bookNumberToGet];
        } else {
            return NULL;
        }
    }

    /**
     * @param Book $book
     * @return int
     */
    public function addBook(Book $book): int
    {
        $this->setBookCount($this->getBookCount() + 1);
        $this->books[$this->getBookCount()] = $book;
        return $this->getBookCount();
    }

    /**
     * @param Book $book
     * @return int
     */
    public function removeBook(Book $book): int
    {
        $counter = 0;
        while (++$counter <= $this->getBookCount()) {
            if ($book->getAuthorAndTitle() ==
                $this->books[$counter]->getAuthorAndTitle())
            {
                for ($x = $counter; $x < $this->getBookCount(); $x++) {
                    $this->books[$x] = $this->books[$x + 1];
                }
                $this->setBookCount($this->getBookCount() - 1);
            }
        }
        return $this->getBookCount();
    }
}