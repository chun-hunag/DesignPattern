package main

// TextRange flyweight, it's essentially an object that allows manipulation at a certain scale
type TextRange struct {
	Start, End               int
	Capitalize, Bold, Italic bool
}

func (t *TextRange) Covers(position int) bool {
	return position >= t.Start && position <= t.End
}
