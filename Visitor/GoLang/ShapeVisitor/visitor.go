package main

import "fmt"

type Visitor interface {
	VisitorForSquare(s *Square)
	VisitorForCircle(c *Circle)
	VisitorForRectangle(r *Rectangle)
}

type AreaCalculator struct {
	area int
}

func (a *AreaCalculator) VisitorForSquare(s *Square) {
	fmt.Println("Calculating area for square")
}

func (a *AreaCalculator) VisitorForCircle(c *Circle) {
	fmt.Println("Calculating area for circle")

}

func (a *AreaCalculator) VisitorForRectangle(r *Rectangle) {
	fmt.Println("Calculating area for rectangle")
}

type MiddleCoordinates struct {
	x int
	y int
}

func (m MiddleCoordinates) VisitorForSquare(s *Square) {
	fmt.Println("Calculating middle point coordinates for square")
}

func (m MiddleCoordinates) VisitorForCircle(c *Circle) {
	fmt.Println("Calculating middle point coordinates for circle")
}

func (m MiddleCoordinates) VisitorForRectangle(r *Rectangle) {
	fmt.Println("Calculating middle point coordinates for rectangle")
}
