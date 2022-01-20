<?php

include_once ('IComponent.php');
include_once ('Decorator.php');

// 具體裝飾者
class ProgramLang extends Decorator
{
    private $languageNow;

    public function __construct(IComponent $dateNow)
    {
        $this->date = $dateNow;
    }

    private $language = [
        'php' => 'PHP',
        'CS' => 'C#',
        'js' => 'JavaScript',
        'as3' => 'ActionScript 3.0'
    ];

    public function getFeature(): string
    {
        $output = $this->date->getFeature();
        $format = "\n  ";
        $output .= "$format Preferred programming language: ";
        $output .= $this->languageNow;
        return $output;
    }

    public function setFeature(string $feature): void
    {
        $this->languageNow = $this->language[$feature];
    }

}