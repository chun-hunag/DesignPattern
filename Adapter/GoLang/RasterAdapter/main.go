package main

import "fmt"

func main() {
	rc := NewRectangle(6, 4)
	a := VectorToRaster(rc) // adapter!
	_ = VectorToRaster(rc)  // adapter!
	fmt.Print(DrawPoints(a))
}
