<?php

include_once ('IComponent.php');
include_once ('Male.php');
include_once ('Female.php');
include_once ('ProgramLang.php');
include_once ('Hardware.php');
include_once ('Food.php');

class Client
{
    private $hotDate;

    public function __construct()
    {
        $this->hotDate = new Female();
        $this->hotDate->setAge(25);
        echo $this->hotDate->getAge();
        $this->hotDate = $this->wrapComponent($this->hotDate);
        echo $this->hotDate->getFeature();
    }

    private function wrapComponent(IComponent $component): IComponent
    {
        $component = new ProgramLang($component);
        $component->setFeature('php');
        $component = new Hardware($component);
        $component->setFeature('lin');
        $component = new Food($component);
        $component->setFeature('veg');

        return $component;
    }
}

$worker = new Client();