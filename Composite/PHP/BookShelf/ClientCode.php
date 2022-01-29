<?php

include_once ('OneBook.php');
include_once ('SeveralBooks.php');

writeln("BEGIN TESTING COMPOSITE PATTERN");
writeln('');

$firstBook = new OneBook('Core PHP Programming, Third Edition', 'Atkinson and Suraski');
writeln('(after creating first book) oneBook info: ');
writeln($firstBook->getBookInfo(1));
writeln('');

$secondBook = new OneBook('PHP Bible', 'Converse and Park');
writeln('(after creating second book) oneBook info: ');
writeln($secondBook->getBookInfo(1));
writeln('');

$thirdBook = new OneBook('Design Patterns', 'Gamma, Helm, Johnson, and Vlissides');
writeln('(after creating third book) oneBook info: ');
writeln($thirdBook->getBookInfo(1));
writeln('');

$books = new SeveralBooks();

$booksCount = $books->addBook($firstBook);
writeln('(after adding firstBook to books) SeveralBooks info : ');
writeln($books->getBookInfo($booksCount));
writeln('');

$booksCount = $books->addBook($secondBook);
writeln('(after adding secondBook to books) SeveralBooks info : ');
writeln($books->getBookInfo($booksCount));
writeln('');

$booksCount = $books->addBook($thirdBook);
writeln('(after adding thirdBook to books) SeveralBooks info : ');
writeln($books->getBookInfo($booksCount));
writeln('');

$booksCount = $books->removeBook($firstBook);
writeln('(after removing firstBook from books) SeveralBooks count : ');
writeln($books->getBookCount());
writeln('');

writeln('(after removing firstBook from books) SeveralBooks info 1 : ');
writeln($books->getBookInfo(1));
writeln('');

writeln('(after removing firstBook from books) SeveralBooks info 2 : ');
writeln($books->getBookInfo(2));
writeln('');

writeln('END TESTING COMPOSITE PATTERN');

function writeln($line) {
    echo $line."\n";
}

