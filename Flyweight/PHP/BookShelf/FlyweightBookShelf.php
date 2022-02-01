<?php

include_once ('FlyweightBook.php');

class FlyweightBookShelf
{
    private $books = array();

    /**
     * @param FlyweightBook $book
     * @return void
     */
    public function addBook(FlyweightBook $book): void
    {
        $this->books[] = $book;
    }

    /**
     * @return string
     */
    public function showBooks(): string
    {
        $return_string = NULL;
        foreach ($this->books as $book) {
            $return_string .= 'title: ' . $book->getAuthor() . '  author: ' . $book->getTitle();
        }
        return $return_string;
    }
}