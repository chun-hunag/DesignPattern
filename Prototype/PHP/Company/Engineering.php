<?php

include_once ('IAcmePrototype.php');
class Engineering extends IAcmePrototype
{
    const UNIT = 'Engineering';
    private $development = 'programming';
    private $design = 'digital artwork';
    private $sysAd = 'system administration';

    /**
     * @param string $organizationCode
     */
    function setDepartment(string $organizationCode): void
    {
        switch ($organizationCode)
        {
            case 301:
                $this->department = $this->development;
                break;
            case 302:
                $this->department = $this->design;
                break;
            case 303:
                $this->department = $this->sysAd;
                break;
            default:
                $this->department = 'Unrecognized Engineering';
        }
    }

    /**
     * @return string
     */
    function getDepartment(): string
    {
        return $this->department;
    }

    function __clone(){}
}