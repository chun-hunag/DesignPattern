<?php

include_once ('Notification.php');

/**
 * Here's an example of the existing class that follows the Target interface.
 */
class EmailNotification implements Notification
{
    private $adminEmail;

    public function __construct(string $adminEmail)
    {
        $this->adminEmail = $adminEmail;
    }

    /**
     * @inheritDoc
     */
    public function send(string $title, string $message): void
    {
        $this->mail($this->adminEmail, $title, $message);
        echo "Sent email with title: '$title' to '{$this->adminEmail}' that says:\n '$message'.";
    }

    protected function mail(string $title, string $message): void
    {
        echo "mail done.\n";
    }
}