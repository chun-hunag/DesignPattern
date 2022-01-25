package main

import "fmt"

type Aged interface {
	Age() int
	SetAge(age int)
}

type Bird struct {
	age int
}

func (bird *Bird) Age() int {
	return bird.age
}

func (bird *Bird) SetAge(age int) {
	bird.age = age
}

func (bird *Bird) Fly() {
	if bird.age >= 10 {
		fmt.Println("Flying!")
	}
}

type Lizard struct {
	age int
}

func (lizard *Lizard) Age() int {
	return lizard.age
}

func (lizard *Lizard) SetAge(age int) {
	lizard.age = age
}

func (lizard *Lizard) Crawl() {
	if lizard.age < 10 {
		fmt.Println("Crawling!")
	}
}

type Dragon struct {
	bird   Bird
	lizard Lizard
}

func (dragon *Dragon) Age() int {
	return dragon.bird.age
}

func (dragon *Dragon) SetAge(age int) {
	dragon.bird.age = age
	dragon.lizard.age = age
}

func (dragon *Dragon) Fly() {
	dragon.bird.Fly()
}

func (dragon *Dragon) Crawl() {
	dragon.lizard.Crawl()
}

func NewDragon() *Dragon {
	return &Dragon{Bird{}, Lizard{}}
}

func main() {
	d := NewDragon()
	d.SetAge(5)
	d.Fly()
	d.Crawl()
}
