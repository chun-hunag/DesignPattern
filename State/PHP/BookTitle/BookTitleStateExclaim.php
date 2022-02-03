<?php

include_once ('BookTitleStateInterface.php');
include_once ('BookTitleStateStars.php');

class BookTitleStateExclaim implements BookTitleStateInterface
{
    /**
     * @param BookContext $context
     * @return string
     */
    public function showTitle(BookContext $context):string
    {
        $title = $context->getBook()->getTitle();

        $context->setTitleState(new BookTitleStateStars());
        return Str_replace(' ','!',$title);
    }
}