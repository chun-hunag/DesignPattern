package main

import "fmt"

type Chess struct {
	turn, maxTurns, currentPlayer int
}

func NewGameOfChess() Game {
	return &Chess{1, 10, 0}
}

func (c *Chess) Start() {
	fmt.Println("Starting a game of chess.")
}

func (c *Chess) HaveWinner() bool {
	return c.turn == c.maxTurns
}

func (c *Chess) TakeTurn() {
	c.turn++
	fmt.Printf("Turn %d taken by player %d\n",
		c.turn, c.currentPlayer)
	c.currentPlayer = (c.currentPlayer + 1) % 2
}

func (c *Chess) WinningPlayer() int {
	return c.currentPlayer
}
