package main

type Buffer struct {
	width, height int
	buffer        []rune
}

func NewBuffer(width int, height int) *Buffer {
	return &Buffer{width, height, make([]rune, width*height)}
}

func (buffer *Buffer) At(index int) rune {
	return buffer.buffer[index]
}
