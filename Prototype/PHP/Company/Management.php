<?php

include_once ('IAcmePrototype.php');
class Management extends IAcmePrototype
{
    const UNIT = 'Management';
    private $research = 'research';
    private $plan = 'planning';
    private $operations = 'operations';

    public function setDepartment(string $organizationCode): void
    {
        switch ($organizationCode)
        {
            case 201:
                $this->department = $this->research;
                break;
            case 202:
                $this->department = $this->plan;
                break;
            case 203:
                $this->department = $this->operations;
                break;
            default:
                $this->department = 'Unrecognized Management';
        }
    }

    public function getDepartment(): string
    {
        return $this->department;
    }

    function __clone(){}
}