package main

import "fmt"

type client struct {
}

func (client *client) insertLightningConnectorIntoComputer(computer computer) {
	fmt.Println("Client inserts Lightning connector into computer.")
	computer.insertIntoLightningPort()
}
