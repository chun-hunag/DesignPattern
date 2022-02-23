package main

type Shape interface {
	Accept(visitor Visitor)
}

type Square struct {
	side int
}

func (s *Square) Accept(visitor Visitor) {
	visitor.VisitorForSquare(s)
}

type Circle struct {
	radius int
}

func (c *Circle) Accept(visitor Visitor) {
	visitor.VisitorForCircle(c)
}

type Rectangle struct {
	length int
	width  int
}

func (r *Rectangle) Accept(visitor Visitor) {
	visitor.VisitorForRectangle(r)
}
