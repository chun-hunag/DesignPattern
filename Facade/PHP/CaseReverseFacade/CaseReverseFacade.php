<?php

include_once ('ArrayStringFunctions.php');
include_once ('ArrayCaseReverse.php');
include_once ('ArrayStringFunctions.php');

class CaseReverseFacade
{
    public static function reverseStringCase(string $string): string
    {
        $arrayFromString = ArrayStringFunctions::stringToArray($string);
        $reversedCaseArray = ArrayCaseReverse::reverseCase($arrayFromString);
        $reversedCaseString = ArrayStringFunctions::arrayToString($reversedCaseArray);
        return $reversedCaseString;
    }
}