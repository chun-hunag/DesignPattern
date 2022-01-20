<?php

include_once ('IComponent.php');

// Female 具體元件
class Female extends IComponent
{
    public function __construct()
    {
        $this->date = 'Female';
        $this->setFeature("\nGrrrl programmer feature: ");
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