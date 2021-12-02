<?php

include_once ('Product.php');
class GraphicProduct implements Product
{
    private $mfgProduct;

    public function getProperties()
    {
        // TODO: Implement getProperties() method.
        $this->mfgProduct = 'This is a graphic.<3';
        return $this->mfgProduct;
    }
}