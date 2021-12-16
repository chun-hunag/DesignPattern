<?php

include_once ('IAcmePrototype.php');
class Marketing extends IAcmePrototype
{
    const UNIT = 'Marketing';
    private $sales = 'sales';
    private $promotion = 'promotion';
    private $strategic = 'strategic planning';

    public function setDepartment(string $organizationCode): void
    {
        switch ($organizationCode)
        {
            case 101:
                $this->department = $this->sales;
                break;
            case 102:
                $this->department = $this->promotion;
                break;
            case 103:
                $this->department = $this->$this->strategic;
                break;
            default:
                $this->department = 'Unrecognized Marketing';
        }
    }

    /**
     * @return string
     */
    public function getDepartment(): string
    {
        return $this->department;
    }

    function __clone()
    {}
}