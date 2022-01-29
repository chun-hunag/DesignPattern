<?php

include_once ('OneBook.php');

abstract class OnTheBookShelf
{
    abstract function getBookInfo($previousBook);
    abstract function getBookCount(): int;
    abstract function setBookCount(int $newCount): bool;
    abstract function addBook(OneBook $oneBook): bool;
    abstract function removeBook(OneBook $oneBook): bool;
}