<?php

include_once ('FemaleProto.php');
include_once ('MaleProto.php');
class Client
{
    private $fly1;
    private $fly2;

    private $clone1Fly;
    private $clone2Fly;
    private $updatedCloneFly;

    public function __construct()
    {
        $this->fly1 = new MaleProto();
        $this->fly2 = new FemaleProto();

        // clone
        $this->clone1Fly = clone $this->fly1;
        $this->clone2Fly = clone $this->fly2;
        $this->updatedCloneFly = clone $this->fly2;

        // update clone
        $this->updatedCloneFly->eyeColor = 'purple';
        $this->updatedCloneFly->wingBeat = '220';
        $this->updatedCloneFly->unitEyes = '750';
        $this->updatedCloneFly->fecundity = '92';

        $this->showFly($this->clone1Fly);
        $this->showFly($this->clone2Fly);
        $this->showFly($this->updatedCloneFly);
    }

    private function  showFly(IPrototype $fly)
    {
        print("Eye color: " . $fly->eyeColor . "\n");
        print("Wing Beats/second: " . $fly->wingBeat . "\n");
        print("Eye units: " . $fly->unitEyes . "\n");

        $genderNow = $fly::GENDER;
        print("Gender: " . $genderNow . "\n");

        if ($genderNow == 'FEMALE') {
            print("Number of eggs: " . $fly->fecundity . "\n");
        } else {
            print("Mated: " . $fly->mated . "\n");
        }
    }
}

$client = new Client();