<?php

include_once ('BridgeBookImp.php');

class BridgeBookCapsImp extends BridgeBookImp
{
    function showAuthor(string $author): string
    {
        return strtoupper($author);
    }
    function showTitle(string $title): string
    {
        return strtoupper($title);
    }
}