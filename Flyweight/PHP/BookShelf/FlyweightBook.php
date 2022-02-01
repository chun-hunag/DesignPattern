<?php

class FlyweightBook
{
    private $author;
    private $title;

    public function __construct(string $author, string $title)
    {
        $this->author = $author;
        $this->title  = $title;
    }

    /**
     * @return string
     */
    public function getAuthor(): string
    {
        return $this->author;
    }

    /**
     * @return string
     */
    public function getTitle(): string
    {
        return $this->title;
    }
}