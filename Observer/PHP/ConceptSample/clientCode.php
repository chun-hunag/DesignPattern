<?php

include_once ('Subject.php');
include_once ('ConcreteObserverA.php');
include_once ('ConcreteObserverB.php');

/**
 * The client code.
 */

$subject = new Subject();

$o1 = new ConcreteObserverA();
$subject->attach($o1);

$o2 = new ConcreteObserverB();
$subject->attach($o2);

$subject->someBusinessLogic();
$subject->someBusinessLogic();

$subject->detach($o2);

$subject->someBusinessLogic();