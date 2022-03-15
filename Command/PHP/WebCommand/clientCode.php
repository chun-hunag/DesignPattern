<?php

include_once ('Queue.php');
include_once ('IMDBGenresScrapingCommand.php');

/**
 * The client code.
 */

$queue = Queue::get();

if ($queue->isEmpty()) {
    $queue->add(new IMDBGenresScrapingCommand());
}

$queue->work();