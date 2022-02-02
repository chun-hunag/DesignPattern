<?php

include_once ('StrategyCaps.php');
include_once ('StrategyExclaim.php');
include_once ('StrategyStars.php');
include_once ('Book.php');

class StrategyContext
{
    private $strategy = NULL;
    //bookList is not instantiated at construct time
    public function __construct(string $strategy_ind_id) {
        switch ($strategy_ind_id) {
            case "C":
                $this->strategy = new StrategyCaps();
                break;
            case "E":
                $this->strategy = new StrategyExclaim();
                break;
            case "S":
                $this->strategy = new StrategyStars();
                break;
        }
    }

    /**
     * @param Book $book
     * @return string
     */
    public function showBookTitle(Book $book): string
    {
        return $this->strategy->showTitle($book);
    }
}