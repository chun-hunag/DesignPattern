<?php

class Kyrgyztan2Product implements Product
{
    private $mfgProduct;

    public function getProperties()
    {
        // TODO: Implement getProperties() method.
        $this->mfgProduct = 'KyrgyztanProduct2';
        return $this->mfgProduct;
    }
}