package main

import "fmt"

type Cashier struct {
	next Department
}

func (c *Cashier) Execute(patient *Patient) {
	if patient.paymentDone {
		fmt.Println("Payment Done")
	}
	fmt.Println("Cashier getting money from patient patient")
}

func (c *Cashier) SetNext(next Department) {
	c.next = next
}
