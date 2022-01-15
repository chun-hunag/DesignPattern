package main

type VectorImage struct {
	Lines []Line
}

func NewRectangle(width, height int) *VectorImage {
	width -= 1
	height -= 1
	return &VectorImage{[]Line{
		Line{0, 0, width, 0},
		Line{0, 0, 0, height},
		Line{width, 0, width, height},
		Line{0, height, width, height},
	}}
}
