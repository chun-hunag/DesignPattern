<?php

include_once ('Abstraction.php');
include_once ('ConcreteImplementationA.php');
include_once ('ConcreteImplementationB.php');
include_once ('ExtendedAbstraction.php');

/**
 * Except for the initialization phase, where an Abstraction object gets linked
 * with a specific Implementation object, the client code should only depend on
 * the Abstraction class. This way the client code can support any abstraction-
 * implementation combination.
 */
function clientCode(Abstraction $abstraction)
{
    // ...

    echo $abstraction->operation();

    // ...
}

/**
 * The client code should be able to work with any pre-configured abstraction-
 * implementation combination.
 */
$implementation = new ConcreteImplementationA();
$abstraction = new Abstraction($implementation);
clientCode($abstraction);

echo "\n";

$implementation = new ConcreteImplementationB();
$abstraction = new ExtendedAbstraction($implementation);
clientCode($abstraction);