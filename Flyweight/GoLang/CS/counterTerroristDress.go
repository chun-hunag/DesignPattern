package main

// CounterTerroristDress flyweight specific object
type CounterTerroristDress struct {
	color string
}

func (c *CounterTerroristDress) getColor() string {
	return c.color
}

func NewCounterTerroristDress() *CounterTerroristDress {
	return &CounterTerroristDress{color: "green"}
}
