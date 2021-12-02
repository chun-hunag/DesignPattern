<?php

include_once ('Product.php');
include_once ('ProductA.php');
include_once ('ProductB.php');

class ProductFactory
{
    public static function generateProduct(string $className): Product
    {
        switch ($className) {
            case 'ProductA':
                return new ProductA();
            case 'ProductB':
                return new ProductB();
        }
    }
}