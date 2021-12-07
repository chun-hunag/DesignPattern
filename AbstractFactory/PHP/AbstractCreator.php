<?php

include_once ('AbstractProductA.php');
include_once ('AbstractProductB.php');
abstract class AbstractCreator
{
    public abstract function createProductA(): AbstractProductA;

    public abstract function createProductB(): AbstractProductB;
}