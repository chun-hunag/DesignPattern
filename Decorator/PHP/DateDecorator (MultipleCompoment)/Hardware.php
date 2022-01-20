<?php

include_once ('IComponent.php');
include_once ('Decorator.php');

// 具體裝飾者
class Hardware extends Decorator
{
    private $hardwareNow;

    public function __construct(IComponent $dateNow)
    {
        $this->date = $dateNow;
    }

    private $box = [
        'mac' => 'Macintosh',
        'dell' => 'Dell',
        'hp' => 'Hewlett-Packard',
        'lin' => 'Linux'
    ];

    public function getFeature(): string
    {
        $output = $this->date->getFeature();
        $format = "\n  ";
        $output .= "$format Current Hardware: ";
        $output .= $this->hardwareNow;
        return $output;
    }

    public function setFeature(string $feature): void
    {
        $this->hardwareNow = $this->box[$feature];
    }

}