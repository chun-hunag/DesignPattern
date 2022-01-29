<?php

include_once ('OnTheBookShelf.php');

class OneBook extends OnTheBookShelf
{
    private $title;
    private $author;
    function __construct(string $title, string $author)
    {
        $this->title = $title;
        $this->author = $author;
    }
    function getBookInfo($bookToGet)
    {
        if (1 == $bookToGet) {
            return $this->title." by ".$this->author;
        } else {
            return FALSE;
        }
    }
    function getBookCount(): int
    {
        return 1;
    }
    function setBookCount(int $newCount):bool
    {
        return FALSE;
    }
    function addBook(OneBook $oneBook): bool
    {
        return FALSE;
    }
    function removeBook(OneBook $oneBook): bool
    {
        return FALSE;
    }
}