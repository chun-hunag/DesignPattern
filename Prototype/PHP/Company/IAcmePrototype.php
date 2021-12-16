<?php

abstract class IAcmePrototype
{
    /**
     * @var string
     */
    protected $name;

    /**
     * @var string
     */
    protected $id;

    /**
     * @var string
     */
    protected $employeePic;

    /**
     * @var string
     */
    protected $department;

    /**
     * @return string
     */
    public function getName(): string
    {
        return $this->name;
    }

    /**
     * @param string $name
     */
    public function setName(string $name): void
    {
        $this->name = $name;
    }

    /**
     * @return string
     */
    public function getId(): string
    {
        return $this->id;
    }

    /**
     * @param string $id
     */
    public function setId(string $id): void
    {
        $this->id = $id;
    }

    /**
     * @return string
     */
    public function getEmployeePic(): string
    {
        return $this->employeePic;
    }

    /**
     * @param string $employeePic
     */
    public function setEmployeePic(string $employeePic): void
    {
        $this->employeePic = $employeePic;
    }

    abstract function setDepartment(string $organizationCode): void;

    abstract function getDepartment(): string;

    abstract function __clone();
}