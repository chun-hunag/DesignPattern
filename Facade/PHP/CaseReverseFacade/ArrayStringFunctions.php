<?php

class ArrayStringFunctions
{
    public static function arrayToString($arrayIn): string
    {
        $stringOut = NULL;
        foreach ($arrayIn as $oneChar) {
            $stringOut .= $oneChar;
        }
        return $stringOut;
    }
    public static function stringToArray($stringIn): array
    {
        return str_split($stringIn);
    }
}