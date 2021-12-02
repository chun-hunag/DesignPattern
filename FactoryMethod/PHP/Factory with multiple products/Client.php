<?php

include_once ('CountryFactory.php');
include_once ('KyrgyztanProduct.php');
include_once ('Kyrgyztan2Product.php');

class Client
{
    private $countryFactory;

    public function __construct()
    {
        $this->countryFactory = new CountryFactory();
        echo $this->countryFactory->doFactory(new KyrgyztanProduct()) . "\n";
        echo $this->countryFactory->doFactory(new Kyrgyztan2Product()) . "\n";
    }
}

$worker = new Client();