<?php

include_once ('Book.php');

interface StrategyInterface {
    public function showTitle(Book $book): string;
}