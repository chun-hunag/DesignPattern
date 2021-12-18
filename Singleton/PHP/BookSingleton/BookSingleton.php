<?php

class BookSingleton
{
    private $author = 'Gamma, Helm, Johnson, and Vlissides';
    private $title  = 'Design Patterns';
    private static $book = NULL;
    private static $isLoanedOut = FALSE;

    private function __construct() {}

    /**
     * @return static|null
     */
    static function borrowBook(): ?self
    {
        if (FALSE == self::$isLoanedOut) {
            if (NULL == self::$book) {
                self::$book = new BookSingleton();
            }
            self::$isLoanedOut = TRUE;
            return self::$book;
        } else {
            return NULL;
        }
    }

    /**
     * @param BookSingleton $bookReturned
     */
    function returnBook(BookSingleton $bookReturned): void
    {
        self::$isLoanedOut = FALSE;
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