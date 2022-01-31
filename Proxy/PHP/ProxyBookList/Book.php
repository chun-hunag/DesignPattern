<?php

class Book
{
    private $author;
    private $title;

    function __construct(string $title, string $author)
    {
        $this->author = $author;
        $this->title = $title;
    }

    /**
     * @return string
     */
    function getAuthor(): string
    {
        return $this->author;
    }

    /**
     * @return string
     */
    function getTitle(): string
    {
        return $this->title;
    }

    /**
     * @return string
     */
    function getAuthorAndTitle(): string
    {
        return $this->getTitle() . ' by ' . $this->getAuthor();
    }
}