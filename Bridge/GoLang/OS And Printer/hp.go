package main

import "fmt"

type Hp struct {
}

func (hp *Hp) printFile() {
	fmt.Println("Printing by a HP Printer")
}
