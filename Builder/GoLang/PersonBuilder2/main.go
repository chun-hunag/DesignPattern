package main

import "fmt"

type Person struct {
	name, position string
}

type personMod func(*Person)

type PersonBuilder struct {
	actions []personMod
}

func (b *PersonBuilder) Called(name string) *PersonBuilder {
	b.actions = append(b.actions, func(person *Person) {
		person.name = name
	})
	return b
}

func (b *PersonBuilder) WorksAsA(position string) *PersonBuilder {
	b.actions = append(b.actions, func(person *Person) {
		person.position = position
	})

	return b
}

func (b *PersonBuilder) Build() *Person {
	person := Person{}
	for _, action := range b.actions {
		action(&person)
	}
	return &person
}

func main() {
	builder := PersonBuilder{}
	person := builder.
		Called("Jam").
		WorksAsA("RD").
		Build()
	fmt.Println(*person)
}
