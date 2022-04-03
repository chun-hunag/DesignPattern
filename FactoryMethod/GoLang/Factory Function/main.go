package main

import "fmt"

func main() {
	// initialize directly
	p := Person{"John", 22}
	fmt.Println(p)

	// use a constructor
	p2 := NewPerson("Jane", 21)
	p2.Age = 30
	fmt.Println(p2)
}
