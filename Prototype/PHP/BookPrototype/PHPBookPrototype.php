<?php

class PHPBookPrototype extends BookPrototype
{
    function __construct() {
        $this->topic='PHP';
    }

    /**
     * will be executed after clone object
     */
    function __clone()
    {
        // TODO: Implement __clone() method.
    }
}