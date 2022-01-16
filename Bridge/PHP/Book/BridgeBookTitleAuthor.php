<?php

include_once ('BridgeBook.php');

class BridgeBookTitleAuthor extends BridgeBook
{

    function showTitleAuthor(): string
    {
        return $this->showTitle() . ' by ' . $this->showAuthor();
    }
}