<?php

include_once ('AbstractObserver.php');

class PatternObserver extends AbstractObserver
{
    public function __construct() {}

    /**
     * @param AbstractSubject $subject
     * @return void
     */
    public function update(AbstractSubject $subject): void
    {
        writeln('*IN PATTERN OBSERVER - NEW PATTERN GOSSIP ALERT*');
        writeln(' new favorite patterns: ' . $subject->getFavorites());
        writeln('*IN PATTERN OBSERVER - PATTERN GOSSIP ALERT OVER*');
    }
}