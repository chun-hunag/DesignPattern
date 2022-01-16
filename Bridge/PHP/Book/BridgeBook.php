<?php

include_once ('BridgeBookImp.php');

abstract class BridgeBook {
    private $bbAuthor;
    private $bbTitle;
    private $bbImp;

    function __construct(string $author, string $title, BridgeBookImp $bridgeBookImp)
    {
        $this->bbAuthor = $author;
        $this->bbTitle  = $title;
        $this->bbImp = $bridgeBookImp;
    }

    function showAuthor(): string
    {
        return $this->bbImp->showAuthor($this->bbAuthor);
    }

    function showTitle(): string
    {
        return $this->bbImp->showTitle($this->bbTitle);
    }
}