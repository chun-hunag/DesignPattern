<?php

include_once ('Product.php');
class TextProduct implements Product
{
    private $mfgProduct;

    public function getProperties()
    {
        // TODO: Implement getProperties() method.
        $this->mfgProduct = 'This is text.';
        return $this->mfgProduct;
    }
}