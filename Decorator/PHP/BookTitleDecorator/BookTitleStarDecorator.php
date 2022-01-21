<?php

include_once ('BookTitleDecorator.php');

class BookTitleStarDecorator extends BookTitleDecorator
{
    private $bookTitleDecorator;

    public function __construct(BookTitleDecorator $bookTitleDecorator)
    {
        $this->bookTitleDecorator = $bookTitleDecorator;
    }

    public function starTitle(): void
    {
        $this->bookTitleDecorator->title = Str_replace(" ","*",$this->bookTitleDecorator->title);
    }
}