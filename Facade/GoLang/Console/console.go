package main

type Console struct {
	buffer    []*Buffer
	Viewports []*Viewport
	offset    int
}

func NewConsole() *Console {
	b := NewBuffer(200, 150)
	v := NewViewport(b)
	return &Console{[]*Buffer{b}, []*Viewport{v}, 0}
}

func (c Console) GetCharacterAt(index int) rune {
	return c.Viewports[0].GetCharacterAt(index)
}
