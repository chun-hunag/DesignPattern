<?php

include_once ('IComponent.php');
include_once ('Decorator.php');

// 具體裝飾者
class Food extends Decorator
{
    private $chowNow;

    public function __construct(IComponent $dateNow)
    {
        $this->date = $dateNow;
    }

    private $snacks = [
      'piz' => 'Pizza',
      'burg' => 'Burgers',
      'nach' => 'Nachos',
      'veg' => 'Veggies'
    ];

    public function getFeature(): string
    {
        $output = $this->date->getFeature();
        $format = "\n  ";
        $output .= "$format Favorite food: ";
        $output .= $this->chowNow . "\n";
        return $output;
    }

    public function setFeature(string $feature): void
    {
        $this->chowNow = $this->snacks[$feature];
    }
}