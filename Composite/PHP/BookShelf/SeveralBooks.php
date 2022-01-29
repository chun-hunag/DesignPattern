<?php

include_once ('OnTheBookShelf.php');
include_once ('OneBook.php');

class SeveralBooks extends OnTheBookShelf
{
    private $oneBooks = array();
    private $bookCount;
    public function __construct() {
        $this->setBookCount(0);
    }
    public function getBookCount(): int
    {
        return $this->bookCount;
    }

    public function setBookCount(int $newCount): bool
    {
        $this->bookCount = $newCount;
        return true;
    }

    public function getBookInfo($bookToGet)
    {
        if ($bookToGet <= $this->bookCount) {
            return $this->oneBooks[$bookToGet]->getBookInfo(1);
        } else {
            return FALSE;
        }
    }

    public function addBook(OneBook $oneBook): bool
    {
        $this->setBookCount($this->getBookCount() + 1);
        $this->oneBooks[$this->getBookCount()] = $oneBook;
        return $this->getBookCount();
    }
    public function removeBook(OneBook $oneBook): bool
    {
        $counter = 0;
        while (++$counter <= $this->getBookCount()) {
            if ($oneBook->getBookInfo(1) ==
                $this->oneBooks[$counter]->getBookInfo(1)) {
                for ($x = $counter; $x < $this->getBookCount(); $x++) {
                    $this->oneBooks[$x] = $this->oneBooks[$x + 1];
                }
                $this->setBookCount($this->getBookCount() - 1);
            }
        }
        return $this->getBookCount();
    }
}
