package main

import "fmt"

type VectorRenderer struct {
	//
}

func (v *VectorRenderer) RenderCircle(radius float32) {
	fmt.Println("Drawing a circle of radius", radius)
}
