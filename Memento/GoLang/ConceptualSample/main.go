package main

import "fmt"

func main() {
	caretaker := &CareTaker{
		mementoArray: make([]*Memento, 0),
	}

	originator := &Originator{
		state: "A",
	}

	fmt.Printf("Originator Current State: %s\n", originator.GetState())
	caretaker.AddMemento(originator.CreateMemento())

	originator.SetState("B")
	fmt.Printf("Originator Current State: %s\n", originator.GetState())
	caretaker.AddMemento(originator.CreateMemento())

	originator.SetState("C")
	fmt.Printf("Originator Current State: %s\n", originator.GetState())
	caretaker.AddMemento(originator.CreateMemento())

	originator.RestoreMemento(caretaker.GetMemento(1))
	fmt.Printf("Restored to State: %s\n", originator.GetState())

	originator.RestoreMemento(caretaker.GetMemento(0))
	fmt.Printf("Restored to State: %s\n", originator.GetState())
}
