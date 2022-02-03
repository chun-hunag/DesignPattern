<?php

include_once ('BookTitleStateStars.php');
include_once ('BookTitleStateInterface.php');

class BookContext
{
    /** @var Book */
    private $book = NULL;

    /** @var BookTitleStateInterface */
    private $bookTitleState = NULL;

    /**
     * bookList is not instantiated at construct time
     * @param Book $book
     */
    public function __construct(Book $book)
    {
        $this->book = $book;
        $this->setTitleState(new BookTitleStateStars());
    }

    /**
     * @return string
     */
    public function getBookTitle(): string
    {
        return $this->bookTitleState->showTitle($this);
    }

    /**
     * @return Book
     */
    public function getBook(): Book
    {
        return $this->book;
    }

    /**
     * @param $titleState
     * @return void
     */
    public function setTitleState($titleState): void
    {
        $this->bookTitleState = $titleState;
    }
}