<?php

class Book
{
    private $author;
    private $title;
    function __construct(string $title, string $author)
    {
        $this->author = $author;
        $this->title  = $title;
    }
    function getAuthor(): string
    {
        return $this->author;
    }

    function getTitle(): string
    {
        return $this->title;
    }

    function getAuthorAndTitle(): string
    {
        return $this->getTitle().' by '.$this->getAuthor();
    }
}