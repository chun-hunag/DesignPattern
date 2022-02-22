<?php

include_once ('Visitor.php');
include_once ('ConcreteVisitor1.php');
include_once ('ConcreteVisitor2.php');
include_once ('ConcreteComponentA.php');
include_once ('ConcreteComponentB.php');

/**
 * The client code can run visitor operations over any set of elements without
 * figuring out their concrete classes. The accept operation directs a call to
 * the appropriate operation in the visitor object.
 */
function clientCode(array $components, Visitor $visitor)
{
    // ...
    foreach ($components as $component) {
        $component->accept($visitor);
    }
    // ...
}

$components = [
    new ConcreteComponentA(),
    new ConcreteComponentB(),
];

echo "The client code works with all visitors via the base Visitor interface:\n";
$visitor1 = new ConcreteVisitor1();
clientCode($components, $visitor1);
echo "\n";

echo "It allows the same client code to work with different types of visitors:\n";
$visitor2 = new ConcreteVisitor2();
clientCode($components, $visitor2);