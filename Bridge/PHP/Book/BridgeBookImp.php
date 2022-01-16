<?php

abstract class BridgeBookImp
{
    abstract function showAuthor(string $author): string;
    abstract function showTitle(string $title): string;
}