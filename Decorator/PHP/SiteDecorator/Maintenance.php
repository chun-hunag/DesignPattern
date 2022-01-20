<?php

include_once ('IComponent.php');
include_once ('Decorator.php');

// 具體裝飾者
class Maintenance extends Decorator
{
    public function __construct(IComponent $siteNow)
    {
        $this->site = $siteNow;
    }

    public function getSite(): string
    {
        $format = "\n   Maintenance ";
        return $this->site->getSite() . $format;
    }


    public function getPrice(): int
    {
        return 950 + $this->site->getPrice();
    }
}