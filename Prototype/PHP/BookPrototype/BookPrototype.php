<?php

abstract class BookPrototype
{
    protected $title;
    protected $topic;

    /**
     * will be executed after clone object
     */
    abstract function __clone();
    function getTitle() {
        return $this->title;
    }
    function setTitle($titleIn) {
        $this->title = $titleIn;
    }
    function getTopic() {
        return $this->topic;
    }
}