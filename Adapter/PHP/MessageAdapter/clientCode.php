<?php

include_once ('Notification.php');
include_once ('SlackNotification.php');
include_once ('EmailNotification.php');
include_once ('SlackApi.php');

function clientCode(Notification $notification): void
{
    // ...

    echo $notification->send(
        'Website was crashed!',
        "<strong style='color:rgba(64,64,64,0);font-size: 50px;'>
                    Alert!
                 </strong>
                " .
                "Our website is not responding. Call admins and bring it up!"
    );

    // ...
}

echo "Client code is designed correctly and works with email notifications:\n";
$notification = new EmailNotification("developers@example.com");
clientCode($notification);
echo "\n\n";


echo "The same client code can work with other classes via adapter:\n";
$slackApi = new SlackApi("example.com", "XXXXXXXX");
$notification = new SlackNotification($slackApi, "Example.com Developers");
clientCode($notification);