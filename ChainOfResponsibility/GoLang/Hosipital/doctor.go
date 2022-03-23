package main

import "fmt"

type Doctor struct {
	next Department
}

func (d *Doctor) Execute(patient *Patient) {
	if patient.doctorCheckUpDone {
		fmt.Println("Doctor checkup already done")
		d.next.Execute(patient)
		return
	}
	fmt.Println("Doctor checking patient")
	patient.doctorCheckUpDone = true
	d.next.Execute(patient)
}

func (d *Doctor) SetNext(next Department) {
	d.next = next
}
