package main

import "fmt"

type Mac struct {
	printer printer
}

func (m *Mac) setPrinter(printer printer) {
	m.printer = printer
}

func (m *Mac) print() {
	fmt.Println("Print request for mac")
	m.printer.printFile()
}
