<?php

include_once ('ProxyBookList.php');
include_once ('Book.php');
include_once ('BookList.php');

writeln( 'BEGIN TESTING PROXY PATTERN');
writeln('');

$proxyBookList = new ProxyBookList();
$inBook = new Book('PHP for Cats','Larry Truett');
$proxyBookList->addBook($inBook);

writeln('test 1 - show the book count after a book is added');
writeln($proxyBookList->getBookCount());
writeln('');

writeln('test 2 - show the book');
$outBook = $proxyBookList->getBook(1);
writeln($outBook->getAuthorAndTitle());
writeln('');

$proxyBookList->removeBook($outBook);

writeln('test 3 - show the book count after a book is removed');
writeln($proxyBookList->getBookCount());
writeln('');

writeln('END TESTING PROXY PATTERN');

function writeln(string $line): void
{
    echo $line."\n";
}