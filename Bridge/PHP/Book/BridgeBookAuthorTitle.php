<?php

include_once ('BridgeBook.php');

class BridgeBookAuthorTitle extends BridgeBook
{
    function showAuthorTitle(): string
    {
        return $this->showAuthor() . "'s " . $this->showTitle();
    }
}