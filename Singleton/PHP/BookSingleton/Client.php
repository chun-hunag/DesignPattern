<?php

include_once ('BookBorrower.php');
class Client
{
    function __construct()
    {
        $this->writeln('BEGIN TESTING SINGLETON PATTERN');

        $bookBorrower1 = new BookBorrower();
        $bookBorrower2 = new BookBorrower();

        $bookBorrower1->borrowBook();
        $this->writeln('BookBorrower1 asked to borrow the book');
        $this->writeln('BookBorrower1 Author and Title: ');
        $this->writeln($bookBorrower1->getAuthorAndTitle());

        $bookBorrower2->borrowBook();
        $this->writeln('BookBorrower2 asked to borrow the book');
        $this->writeln('BookBorrower2 Author and Title: ');
        $this->writeln($bookBorrower2->getAuthorAndTitle());

        $bookBorrower1->returnBook();
        $this->writeln('BookBorrower1 returned the book');

        $bookBorrower2->borrowBook();
        $this->writeln('BookBorrower2 Author and Title: ');
        $this->writeln($bookBorrower1->getAuthorAndTitle());

        $this->writeln('END TESTING SINGLETON PATTERN');
    }

    /**
     * @param string $message
     */
    function writeln(string $message): void
    {
        print($message."\n");
    }
}

$client = new Client();