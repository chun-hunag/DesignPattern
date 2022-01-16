<?php

include_once ('BridgeBookImp.php');

class BridgeBookStarsImp extends BridgeBookImp
{
    function showAuthor(string $author): string
    {
        return Str_replace(" ", "*", $author);
    }

    function showTitle(string $title): string
    {
        return Str_replace(" ", "*", $title);
    }
}