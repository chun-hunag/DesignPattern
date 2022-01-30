package main

import "fmt"

func main() {
	drawing := GraphicObject{"My Drawing", "", nil}
	drawing.Children = append(drawing.Children, *NewSquare("Red"))
	drawing.Children = append(drawing.Children, *NewCircle("Yellow"))

	group := GraphicObject{"Group 1", "", nil}
	group.Children = append(group.Children, *NewCircle("Blue"))
	group.Children = append(group.Children, *NewSquare("Blue"))
	drawing.Children = append(drawing.Children, group)
	fmt.Println(drawing.String())
}
