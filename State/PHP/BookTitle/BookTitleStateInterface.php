<?php

include_once ('BookContext.php');

interface BookTitleStateInterface
{
    /**
     * @param string $context
     * @return mixed
     */
    public function showTitle(BookContext $context);
}