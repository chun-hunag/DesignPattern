<?php

include_once ('AbstractCreator.php');
include_once ('ProductA1.php');
include_once ('ProductB1.php');
class Creator1 extends AbstractCreator
{

    public function createProductA(): AbstractProductA
    {
        // TODO: Implement createProductA() method.
        return new ProductA1();
    }

    public function createProductB(): AbstractProductB
    {
        // TODO: Implement createProductB() method.
        return new ProductB1();
    }
}