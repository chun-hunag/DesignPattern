<?php

include_once ('StrategyInterface.php');
include_once ('Book.php');

class StrategyStars implements StrategyInterface
{

    /**
     * @param Book $book
     * @return string
     */
    public function showTitle(Book $book): string
    {
        $title = $book->getTitle();
        return Str_replace(' ','*',$title);
    }
}