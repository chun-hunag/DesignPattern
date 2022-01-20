<?php

// Component 介面
abstract class IComponent
{
    protected $site;
    abstract public function getSite(): string;
    abstract public function getPrice(): int;
}