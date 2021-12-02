<?php

include_once ('ProductFactory.php');
include_once ('Product.php');
include_once ('ProductB.php');
class ProductBFactory extends ProductFactory
{

    function generateProduct(array $params): Product
    {
        // TODO: Implement generateProduct() method.
        return new ProductB();
    }
}