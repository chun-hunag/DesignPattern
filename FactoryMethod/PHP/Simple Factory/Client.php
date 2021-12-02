<?php

include_once ('ProductFactory.php');
class Client
{
    function __construct()
    {
        $productA = ProductFactory::generateProduct(ProductA::class);
        $productA->method2();
        $productB = ProductFactory::generateProduct(ProductB::class);
        $productB->method2();
    }
}

$worker = new Client();