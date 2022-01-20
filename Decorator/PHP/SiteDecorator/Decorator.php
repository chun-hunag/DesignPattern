<?php

include_once ('IComponent.php');

// Decorator 參與者
abstract class Decorator extends IComponent
{
    // This class extends getSite(), getPrices()
    // It's job is keeping Component reference
    // abstract public function getSite(): string
    // abstract public function getPrice(): int
}