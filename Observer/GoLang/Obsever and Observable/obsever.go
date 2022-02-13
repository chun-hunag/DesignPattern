package main

import (
	"container/list"
	"fmt"
)

type Observer interface {
	Notify(data interface{})
}

type Person struct {
	Observable
	Name string
}

func NewPerson(name string) *Person {
	return &Person{
		Observable: Observable{new(list.List)},
		Name:       name,
	}
}

func (p *Person) CatchACold() {
	p.Fire(p.Name)
}

type DoctorService struct{}

func (d *DoctorService) Notify(data interface{}) {
	fmt.Printf("A doctor has been called for %s", data.(string))
}
