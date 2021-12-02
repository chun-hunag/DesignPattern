<?php

include_once ('ProductFactory.php');
include_once ('Product.php');
include_once ('ProductA.php');
class ProductAFactory extends ProductFactory
{

    function generateProduct(array $params): Product
    {
        // TODO: Implement generateProduct() method.
        return new ProductA();
    }
}