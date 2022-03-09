package main

import "fmt"

func main() {
	ba := NewBankAccount(100)
	ba.Deposit(50)
	ba.Deposit(25)
	fmt.Println(ba)

	ba.Undo()
	fmt.Println("Undo 1:", ba)
	ba.Undo()
	fmt.Println("Undo 2:", ba)
	ba.Redo()
	fmt.Println("Redo:", ba)
}
