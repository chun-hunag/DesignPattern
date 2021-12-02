<?php

include_once ('ProductAFactory.php');
include_once ('ProductBFactory.php');
class Client
{
    function __construct()
    {
        $productA = (new ProductAFactory())->generateProduct([]);
        $productA->method2();
        $productB = (new ProductBFactory())->generateProduct([]);
        $productB->method2();
    }
}

$worker = new Client();