package main

import "fmt"

func main() {
	p := Person{"Alexander", "Graham", "Bell"}
	for _, name := range p.Names() {
		fmt.Println(name)
	}

	fmt.Println("-----------")

	for name := range p.NamesGenerator() {
		fmt.Println(name)
	}

	fmt.Println("-----------")

	for it := NewPersonNameIterator(&p); it.MoveNext(); {
		fmt.Println(it.Value())
	}
}
