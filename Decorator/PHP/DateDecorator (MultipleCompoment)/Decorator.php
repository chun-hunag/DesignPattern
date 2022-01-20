<?php

include_once ('IComponent.php');

// Decorator 參與者
abstract class Decorator extends IComponent
{

    public function getAge(): int
    {
        return $this->ageGroup;
    }

    public function setAge(int $ageNow)
    {
        $this->ageGroup = $ageNow;
    }
}