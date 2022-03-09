package main

type CareTaker struct {
	mementoArray []*Memento
}

func (c *CareTaker) AddMemento(memento *Memento) {
	c.mementoArray = append(c.mementoArray, memento)
}

func (c *CareTaker) GetMemento(index int) *Memento {
	return c.mementoArray[index]
}
