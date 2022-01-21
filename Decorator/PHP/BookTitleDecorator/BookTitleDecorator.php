<?php

include_once ('Book.php');

class BookTitleDecorator
{
    protected $book;
    protected $title;

    public function __construct(Book $book) {
        $this->book = $book;
        $this->resetTitle();
    }

    //doing this so original object is not altered
    public function resetTitle(): void
    {
        $this->title = $this->book->getTitle();
    }

    public function showTitle(): string
    {
        return $this->title;
    }
}