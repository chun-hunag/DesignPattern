<?php

include_once ('FlyweightBook.php');
include_once ('FlyweightBookShelf.php');
include_once ('FlyweightFactory.php');

writeln('BEGIN TESTING FLYWEIGHT PATTERN');

$flyweightFactory = new FlyweightFactory();
$flyweightBookShelf1 =  new FlyweightBookShelf();
$flyweightBook1 = $flyweightFactory->getBook(1);
$flyweightBookShelf1->addBook($flyweightBook1);
$flyweightBook2 = $flyweightFactory->getBook(1);
$flyweightBookShelf1->addBook($flyweightBook2);

writeln('test 1 - show the two books are the same book');
if ($flyweightBook1 === $flyweightBook2) {
    writeln('1 and 2 are the same');
} else {
    writeln('1 and 2 are not the same');
}
writeln('');

writeln('test 2 - with one book on one self twice');
writeln($flyweightBookShelf1->showBooks());
writeln('');

$flyweightBookShelf2 =  new FlyweightBookShelf();
$flyweightBook1 = $flyweightFactory->getBook(2);
$flyweightBookShelf2->addBook($flyweightBook1);
$flyweightBookShelf1->addBook($flyweightBook1);

writeln('test 3 - book shelf one');
writeln($flyweightBookShelf1->showBooks());
writeln('');

writeln('test 3 - book shelf two');
writeln($flyweightBookShelf2->showBooks());
writeln('');

writeln('END TESTING FLYWEIGHT PATTERN');


function writeln(string $line): void
{
    echo $line."\n";
}
