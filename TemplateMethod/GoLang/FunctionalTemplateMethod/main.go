package main

import "fmt"

func main() {
	turn, maxTurns, currentPlayer := 1, 10, 0

	start := func() {
		fmt.Println("Starting a game of chess.")
	}

	takeTurn := func() {
		turn++
		fmt.Printf("Turn %d taken by player %d\n",
			turn, currentPlayer)
		currentPlayer = (currentPlayer + 1) % 2
	}

	haveWinner := func() bool {
		return turn == maxTurns
	}

	winningPlayer := func() int {
		return currentPlayer
	}

	PlayGame(start, takeTurn, haveWinner, winningPlayer)
}
