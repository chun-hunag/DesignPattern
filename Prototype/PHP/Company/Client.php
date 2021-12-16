<?php

include_once ('Marketing.php');
include_once ('Management.php');
include_once ('Engineering.php');
class Client
{
    private $market;
    private $manage;
    private $engineer;

    public function __construct()
    {
        $this->makeConProto();
        $Tess = clone $this->market;
        $this->setEmployee($Tess, 'Tess Smith', 101, 'ts101-1234', 'tess.png');
        $this->showEmployee($Tess);

        $Jacob = clone $this->market;
        $this->setEmployee($Jacob, 'Jacob Jones', 102, 'jj101-2234', 'jacob.png');
        $this->showEmployee($Jacob);

        $Ricky = clone $this->manage;
        $this->setEmployee($Ricky, 'Ricky Rodriguez', 203, 'rr203-5634', 'ricky.png');
        $this->showEmployee($Ricky);

        $Olivia = clone $this->engineer;
        $this->setEmployee($Olivia, 'Olivia Perez', 302, 'op301-1278', 'olivia.png');
        $this->showEmployee($Olivia);
//
        $John = clone $this->engineer;
        $this->setEmployee($John, 'John Jackson', 301, 'jj302-1454', 'john.png');
        $this->showEmployee($John);
    }

    private function makeConProto(): void
    {
        $this->market = new Marketing();
        $this->manage = new Management();
        $this->engineer = new Engineering();
    }

    /**
     * @param IAcmePrototype $employeeNow
     */
    private function showEmployee(IAcmePrototype $employeeNow): void
    {
        print($employeeNow->getEmployeePic() . "\n");
        print($employeeNow->getName() . "\n");
        print($employeeNow->getDepartment() . ': ' . $employeeNow::UNIT . "\n");
        print($employeeNow->getId() . "\n");
        print("-----------------\n");
    }

    /**
     * @param IAcmePrototype $employeeNow
     * @param string $name
     * @param string $department
     * @param string $id
     * @param string $employeePic
     */
    private function setEmployee(IAcmePrototype $employeeNow, string $name, string $department, string $id, string $employeePic): void
    {
        $employeeNow->setName($name);
        $employeeNow->setDepartment($department);
        $employeeNow->setId($id);
        $employeeNow->setEmployeePic($employeePic);
    }
}

$client = new Client();