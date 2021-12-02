<?php

include_once ('Product.php');
class KyrgyztanProduct implements Product
{
    private $mfgProduct;

    public function getProperties()
    {
        // TODO: Implement getProperties() method.
        $this->mfgProduct = 'KyrgyztanProduct';
        return $this->mfgProduct;
    }
}