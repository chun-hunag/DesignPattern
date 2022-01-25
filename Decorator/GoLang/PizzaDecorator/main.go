package main

import "fmt"

func main() {
	pizza := &veggieMania{}
	fmt.Printf("Price of origin pizza is %d\n", pizza.getPrice())

	pizzaWithCheese := &cheeseTopping{
		Pizza: pizza,
	}
	fmt.Printf("Price of pizza with cheese is %d\n", pizzaWithCheese.getPrice())

	pizzaWithCheeseAndTomato := &tomatoTopping{
		Pizza: pizzaWithCheese,
	}
	fmt.Printf("Price of pizza with cheese and toamto is %d\n", pizzaWithCheeseAndTomato.getPrice())
}
