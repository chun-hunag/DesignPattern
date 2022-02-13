package main

import (
	"container/list"
	"fmt"
)

type Person struct {
	Observable
	age int
}

func NewPerson(age int) *Person {
	return &Person{Observable{new(list.List)}, age}
}

func (p *Person) Age() int {
	return p.age
}

func (p *Person) SetAge(age int) {
	if age == p.age {
		return
	}

	p.age = age
	p.Fire(PropertyChanged{"Age", p.age})
}

type PropertyChanged struct {
	Name  string
	Value interface{}
}

type TrafficManagement struct {
	o Observable
}

func (t *TrafficManagement) Notify(data interface{}) {
	if pc, ok := data.(PropertyChanged); ok {
		if pc.Value.(int) >= 16 {
			fmt.Println("Congrats, you can drive now!")
			// we no longer care
			t.o.Unsubscribe(t)
		}
	}
}