<?php

include_once ('Book.php');
include_once ('BookContext.php');

writeln('BEGIN TESTING STATE PATTERN');
writeln('');

$book = new Book('PHP for Cats','Larry Truett');;
$context = new bookContext($book);

writeln('test 1 - show name');
writeln($context->getBookTitle());
writeln('');

writeln('test 2 - show name');
writeln($context->getBookTitle());
writeln('');

writeln('test 3 - show name');
writeln($context->getBookTitle());
writeln('');

writeln('test 4 - show name');
writeln($context->getBookTitle());
writeln('');

writeln('END TESTING STATE PATTERN');

function writeln(string $line) {
    echo $line . "\n";
}

