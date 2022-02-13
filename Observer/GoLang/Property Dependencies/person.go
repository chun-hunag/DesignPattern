package main

import (
	"container/list"
	"fmt"
)

type Person struct {
	Observable
	age int
}

func (p *Person) Age() int {
	return p.age
}

func (p *Person) SetAge(age int) {
	if age == p.age {
		return
	} // no change

	oldCanVote := p.CanVote()

	p.age = age
	p.Fire(PropertyChanged{"Age", p.age})

	if oldCanVote != p.CanVote() {
		p.Fire(PropertyChanged{"CanVote", p.CanVote()})
	}
}

func (p *Person) CanVote() bool {
	return p.age >= 18
}

func NewPerson(age int) *Person {
	return &Person{Observable{new(list.List)}, age}
}

type PropertyChanged struct {
	Name  string
	Value interface{}
}

type ElectrocalRoll struct {
}

func (e *ElectrocalRoll) Notify(data interface{}) {
	if pc, ok := data.(PropertyChanged); ok {
		if pc.Name == "CanVote" && pc.Value.(bool) {
			fmt.Println("Congratulations, you can vote!")
		}
	}
}
