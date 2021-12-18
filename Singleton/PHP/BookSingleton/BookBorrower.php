<?php

include_once ('BookSingleton.php');
class BookBorrower
{
    private $borrowedBook;
    private $haveBook = FALSE;

    function __construct() {}

    /**
     * @return string
     */
    function getAuthorAndTitle(): string
    {
        if (TRUE == $this->haveBook) {
            return $this->borrowedBook->getAuthorAndTitle();
        } else {
            return "I don't have the book";
        }
    }

    function borrowBook(): void
    {
        $this->borrowedBook = BookSingleton::borrowBook();
        if ($this->borrowedBook == NULL) {
            $this->haveBook = FALSE;
        } else {
            $this->haveBook = TRUE;
        }
    }

    function returnBook(): void
    {
        $this->borrowedBook->returnBook($this->borrowedBook);
    }
}