package main

import "fmt"

func main() {
	ak47, _ := GetGun(AK47)
	musket, _ := GetGun(MUSKET)

	printDetails(ak47)
	printDetails(musket)
}

func printDetails(g IGun) {
	fmt.Printf("Gun: %s", g.GetName())
	fmt.Println()
	fmt.Printf("Power: %d", g.GetPower())
	fmt.Println()
}
