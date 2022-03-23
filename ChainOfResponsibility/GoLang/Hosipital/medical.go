package main

import "fmt"

type Medical struct {
	next Department
}

func (m *Medical) Execute(patient *Patient) {
	if patient.medicineDone {
		fmt.Println("Medicine already given to patient")
		m.next.Execute(patient)
		return
	}
	fmt.Println("Medical giving medicine to patient")
	patient.medicineDone = true
	m.next.Execute(patient)
}

func (m *Medical) SetNext(next Department) {
	m.next = next
}
