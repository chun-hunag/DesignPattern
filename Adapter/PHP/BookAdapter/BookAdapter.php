<?php

include_once ('BookInfo.php');
include_once ('SimpleBook.php');


class BookAdapter implements BookInfo
{
    private $book;

    public function __construct(SimpleBook $book)
    {
        $this->book = $book;
    }

    /**
     * @inheritDoc
     */
    public function getAuthorAndTitle(): string
    {
        return $this->book->getTitle() . " by " . $this->book->getAuthor();
    }
}