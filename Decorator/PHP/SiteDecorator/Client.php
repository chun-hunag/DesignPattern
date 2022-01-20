<?php

include_once ('IComponent.php');
include_once ('BasicSite.php');
include_once ('Maintenance.php');
include_once ('Video.php');
include_once ('Database.php');

// Client
class Client
{
    private $basicSite;

    public function __construct()
    {
        $this->basicSite = new BasicSite();
        $this->basicSite = $this->wrapComponent($this->basicSite);

        $siteShow = $this->basicSite->getSite();
        $format = "\n  <strong>Total= $";
        $price = $this->basicSite->getPrice();

        echo $siteShow . $format . $price . "</strong><p/>";
    }

    private function wrapComponent(IComponent $component)
    {
        $component = new Maintenance($component);
        $component = new Video($component);
        $component = new Database($component);
        return $component;
    }
}

$worker = new Client();