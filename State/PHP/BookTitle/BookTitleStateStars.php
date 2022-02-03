<?php

include_once ('BookTitleStateInterface.php');
include_once ('BookTitleStateExclaim.php');

class BookTitleStateStars implements BookTitleStateInterface
{
    /**
     * @param BookContext $context
     * @return string
     */
    public function showTitle(BookContext $context): string
    {
        $title = $context->getBook()->getTitle();
        $context->setTitleState(new BookTitleStateExclaim);

        return Str_replace(' ','*',$title);
    }
}