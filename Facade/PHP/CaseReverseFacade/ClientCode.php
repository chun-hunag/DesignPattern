<?php

include_once ('Book.php');
include_once ('CaseReverseFacade.php');

writeln('BEGIN TESTING FACADE PATTERN');
writeln('');

$book = new Book('Design Patterns', 'Gamma, Helm, Johnson, and Vlissides');

writeln('Original book title: '.$book->getTitle());
writeln('');

$bookTitleReversed = CaseReverseFacade::reverseStringCase($book->getTitle());

writeln('Reversed book title: '.$bookTitleReversed);
writeln('');

writeln('END TESTING FACADE PATTERN');

function writeln(string $line): void
{
    echo $line."\n";
}
