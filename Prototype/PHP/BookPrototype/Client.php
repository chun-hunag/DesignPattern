<?php

include_once ('BookPrototype.php');
include_once ('PHPBookPrototype.php');
include_once ('SQLBookPrototype.php');

class Client
{
    function __construct()
    {
        $this->writeln('BEGIN TESTING PROTOTYPE PATTERN');
        $this->writeln('');

        $phpProto = new PHPBookPrototype();
        $sqlProto = new SQLBookPrototype();

        $book1 = clone $sqlProto;
        $book1->setTitle('SQL For Cats');
        $this->writeln('Book 1 topic: '.$book1->getTopic());
        $this->writeln('Book 1 title: '.$book1->getTitle());
        $this->writeln('');

        $book2 = clone $phpProto;
        $book2->setTitle('OReilly Learning PHP 5');
        $this->writeln('Book 2 topic: '.$book2->getTopic());
        $this->writeln('Book 2 title: '.$book2->getTitle());
        $this->writeln('');

        $this->writeln('Book 1 topic: '.$book1->getTopic());
        $this->writeln('Book 1 title: '.$book1->getTitle());
        $this->writeln('');

        $book3 = clone $sqlProto;
        $book3->setTitle('OReilly Learning SQL');
        $this->writeln('Book 3 topic: '.$book3->getTopic());
        $this->writeln('Book 3 title: '.$book3->getTitle());
        $this->writeln('');

        $this->writeln('END TESTING PROTOTYPE PATTERN');
    }

    function writeln($lineIn) {
        echo $lineIn."\n";
    }
}

$client = new Client();