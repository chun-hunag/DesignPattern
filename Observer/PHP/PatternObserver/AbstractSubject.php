<?php

include_once ('AbstractObserver.php');

abstract class AbstractSubject
{
    abstract function attach(AbstractObserver $observer): void;
    abstract function detach(AbstractObserver $observer): void;
    abstract function notify(): void;
}