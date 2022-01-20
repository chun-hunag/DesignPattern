<?php

include_once ('IComponent.php');

// Male 具體元件
class Male extends IComponent
{
    public function __construct()
    {
        $this->date = 'Male';
        $this->setFeature("\nDude programmer feature: ");
    }

    public function getAge(): int
    {
        return $this->ageGroup;
    }

    public function setAge(int $ageNow): void
    {
        $this->ageGroup = $ageNow;
    }

    public function getFeature(): string
    {
        return $this->feature;
    }

    public function setFeature(string $feature): void
    {
        $this->feature = $feature;
    }
}