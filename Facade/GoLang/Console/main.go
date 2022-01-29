package main

import "fmt"

func main() {
	console := NewConsole()
	u := console.GetCharacterAt(1)
	fmt.Println(u)
}
