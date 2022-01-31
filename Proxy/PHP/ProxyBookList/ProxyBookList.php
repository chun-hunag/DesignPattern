<?php

class ProxyBookList
{
    private $bookList = NULL;

    //bookList is not instantiated at construct time
    public function __construct() {}

    /**
     * @return int
     */
    public function getBookCount(): int
    {
        if (NULL == $this->bookList) {
            $this->makeBookList();
        }
        return $this->bookList->getBookCount();
    }

    /**
     * @param Book $book
     * @return int
     */
    public function addBook(Book $book): int
    {
        if (NULL == $this->bookList) {
            $this->makeBookList();
        }
        return $this->bookList->addBook($book);
    }

    /**
     * @param int $bookNum
     * @return Book
     */
    public function getBook(int $bookNum): Book
    {
        if (NULL == $this->bookList) {
            $this->makeBookList();
        }
        return $this->bookList->getBook($bookNum);
    }

    /**
     * @param $book
     * @return int
     */
    public function removeBook($book): int
    {
        if (NULL == $this->bookList) {
            $this->makeBookList();
        }
        return $this->bookList->removeBook($book);
    }

    /**
     * Create
     * @return void
     */
    public function makeBookList(): void
    {
        $this->bookList = new bookList();
    }
}