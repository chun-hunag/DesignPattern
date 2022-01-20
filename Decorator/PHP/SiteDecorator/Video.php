<?php

include_once ('IComponent.php');
include_once ('Decorator.php');

// 具體裝飾者
class Video extends IComponent
{
    public function __construct(IComponent $siteNow)
    {
        $this->site = $siteNow;
    }

    public function getSite(): string
    {
        $format = "\n   MySQL Database ";
        return $this->site->getSite() . $format;
    }

    public function getPrice(): int
    {
        return 800 + $this->site->getPrice();
    }
}