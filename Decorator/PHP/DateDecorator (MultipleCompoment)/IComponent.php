<?php

// Component 介面
abstract class IComponent
{
    protected $date;
    protected $ageGroup;
    protected $feature;

    abstract public function getAge(): int;
    abstract public function setAge(int $ageNow);
    abstract public function getFeature(): string;
    abstract public function setFeature(string $feature): void;
}