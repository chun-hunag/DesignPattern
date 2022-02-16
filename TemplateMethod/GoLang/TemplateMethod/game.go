package main

import "fmt"

type Game interface {
	Start()
	TakeTurn()
	HaveWinner() bool
	WinningPlayer() int
}

func PlayGame(g Game) {
	g.Start()
	for !g.HaveWinner() {
		g.TakeTurn()
	}
	fmt.Printf("Player %d wins. \n",
		g.WinningPlayer())
}
