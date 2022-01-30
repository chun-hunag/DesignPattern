package main

import "strings"

type GraphicObject struct {
	Name, Color string
	Children    []GraphicObject
}

func (g GraphicObject) String() string {
	stringBuilder := strings.Builder{}
	g.print(&stringBuilder, 0)
	return stringBuilder.String()
}

func (g GraphicObject) print(stringBuilder *strings.Builder, depth int) {
	stringBuilder.WriteString(strings.Repeat("*", depth))
	if len(g.Color) > 0 {
		stringBuilder.WriteString(g.Color)
		stringBuilder.WriteRune(' ')
	}
	stringBuilder.WriteString(g.Name)
	stringBuilder.WriteRune(' ')

	for _, child := range g.Children {
		child.print(stringBuilder, depth+1)
	}
}

func NewCircle(color string) *GraphicObject {
	return &GraphicObject{"Circle", color, nil}
}

func NewSquare(color string) *GraphicObject {
	return &GraphicObject{"Square", color, nil}
}

