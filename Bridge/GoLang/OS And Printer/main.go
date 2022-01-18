package main

import "fmt"

func main() {
	hpPrinter := &Hp{}
	epsonPrinter := &Epson{}

	macComputer := &Mac{}
	macComputer.setPrinter(hpPrinter)
	macComputer.print()
	fmt.Println()

	macComputer.setPrinter(epsonPrinter)
	macComputer.print()
	fmt.Println()

	windowsComputer := &Windows{}
	windowsComputer.setPrinter(hpPrinter)
	windowsComputer.print()
	fmt.Println()

	windowsComputer.setPrinter(epsonPrinter)
	windowsComputer.print()
	fmt.Println()
}
