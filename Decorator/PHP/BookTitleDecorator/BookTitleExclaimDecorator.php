<?php

include_once ('BookTitleDecorator.php');

class BookTitleExclaimDecorator extends BookTitleDecorator {

    private $bookTitleDecorator;

    public function __construct(BookTitleDecorator $bookTitleDecorator)
    {
        $this->bookTitleDecorator = $bookTitleDecorator;
    }

    public function exclaimTitle(): void
    {
        $this->bookTitleDecorator->title = "!" . $this->bookTitleDecorator->title . "!";
    }
}