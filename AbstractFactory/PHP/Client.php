<?php

include_once ('AbstractFactory');
include_once ('Creator1.php');
include_once ('Creator2.php');

class Client
{
    public $productFactory1;
    public $productFactory2;

    public function __construct()
    {
        $this->productFactory1 = new Creator1();
        $this->productFactory2 = new Creator2();
        $productA1 = $this->productFactory1->createProductA();
        $productB1 = $this->productFactory2->createProductB();
        $productA2 = $this->productFactory1->createProductA();
        $productB2 = $this->productFactory2->createProductB();

        $productA1->doSomething();
        $productB1->doSomething();
        $productA2->doSomething();
        $productB2->doSomething();
    }
}

$worker = new Client();