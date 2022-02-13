package main

import "fmt"

func main() {
	p := NewPerson(0)
	er := &ElectrocalRoll{}
	p.Subscribe(er)

	for i := 10; i < 20; i++ {
		fmt.Println("Setting age to", i)
		p.SetAge(i)
	}
}
