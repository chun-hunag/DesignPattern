<?php

class SQLBookPrototype extends BookPrototype
{
    function __construct() {
        $this->topic = 'SQL';
    }

    /**
     * will be executed after clone object
     */
    function __clone()
    {
        // TODO: Implement __clone() method.
    }
}