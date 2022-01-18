package main

import "fmt"

type Windows struct {
	printer printer
}

func (w *Windows) setPrinter(printer printer) {
	w.printer = printer
}

func (w *Windows) print() {
	fmt.Println("Print request for windows")
	w.printer.printFile()
}
