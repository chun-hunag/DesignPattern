<?php

include_once ('AbstractCreator.php');
include_once ('ProductA2.php');
include_once ('ProductB2.php');
class Creator2 extends AbstractCreator
{

    public function createProductA(): AbstractProductA
    {
        // TODO: Implement createProductA() method.
        return new ProductA2();
    }

    public function createProductB(): AbstractProductB
    {
        // TODO: Implement createProductB() method.
        return new ProductB2();
    }
}