<?php

include_once ('IComponent.php');

// 具體元件
class BasicSite extends IComponent
{
    public function __construct()
    {
        $this->site = "Basic Site";
    }

    public function getSite(): string
    {
        return $this->site;
    }

    public function getPrice(): int
    {
        return 1200;
    }
}