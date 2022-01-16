<?php

include_once ('BridgeBookCapsImp.php');
include_once ('BridgeBookStarsImp.php');
include_once ('BridgeBookAuthorTitle.php');
include_once ('BridgeBookTitleAuthor.php');

writeln('BEGIN TESTING BRIDGE PATTERN');
writeln('');

$bookCatImplement = new BridgeBookCapsImp();
$bookStarsImplement = new BridgeBookStarsImp();

writeln('test 1 - author title with caps');
$book = new BridgeBookAuthorTitle('Larry Truett', 'PHP for Cats', $bookCatImplement);
writeln($book->showAuthorTitle());
writeln('');

writeln('test 2 - author title with stars');
$book = new BridgeBookAuthorTitle('Larry Truett', 'PHP for Cats', $bookStarsImplement);
writeln($book->showAuthorTitle());
writeln('');

writeln('test 3 - title author with caps');
$book = new BridgeBookTitleAuthor('Larry Truett', 'PHP for Cats', $bookCatImplement);
writeln($book->showTitleAuthor());
writeln('');

writeln('test 4 - title author with stars');
$book = new BridgeBookTitleAuthor('Larry Truett','PHP for Cats', $bookStarsImplement);
writeln($book->showTitleAuthor());
writeln('');

writeln('END TESTING BRIDGE PATTERN');

function writeln($line_in) {
    echo $line_in."\n";
}