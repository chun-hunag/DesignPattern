package main

type Game struct {
	terrorists        []*Player
	counterTerrorists []*Player
}

func NewGame() *Game {
	return &Game{
		terrorists:        make([]*Player, 1),
		counterTerrorists: make([]*Player, 1),
	}
}

func (g *Game) addTerrorist(dressType string) {
	player := NewPlayer("T", dressType)
	g.terrorists = append(g.terrorists, player)
}

func (g *Game) addCounterTerrorist(dressType string) {
	player := NewPlayer("CT", dressType)
	g.counterTerrorists = append(g.counterTerrorists, player)
}
