<?php

include_once ('AbstractSubject.php');

class PatternSubject extends AbstractSubject
{
    private $favoritePatterns = NULL;
    private $observers = array();

    public function __construct() {}

    public function attach(AbstractObserver $observer): void
    {
        //could also use array_push($this->observers, $observer);
        $this->observers[] = $observer;
    }

    public function detach(AbstractObserver $observer): void
    {
        //$key = array_search($observer, $this->observers);
        foreach($this->observers as $okey => $oval) {
            if ($oval == $observer) {
                unset($this->observers[$okey]);
            }
        }
    }

    public function notify(): void
    {
        foreach($this->observers as $obs) {
            $obs->update($this);
        }
    }

    public function updateFavorites($newFavorites): void
    {
        $this->favorites = $newFavorites;
        $this->notify();
    }

    public function getFavorites()
    {
        return $this->favorites;
    }
}