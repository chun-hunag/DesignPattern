package main

import (
	"fmt"
)

func main() {
	text := "This is a brave new world"

	// use more memory
	ft := NewFormattedText(text)
	ft.Capitalize(10, 15)
	fmt.Println(ft.String())

	// use less memory
	bft := NewBetterFormattedText(text)
	bft.Range(16, 19).Capitalize = true
	fmt.Println(bft.String())
}
