<?php

include_once ('Product.php');
abstract class ProductFactory
{
    abstract function generateProduct(array $params): Product;
}