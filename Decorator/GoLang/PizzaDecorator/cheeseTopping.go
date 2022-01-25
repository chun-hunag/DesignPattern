package main

type cheeseTopping struct {
	Pizza Pizza
}

func (cheeseTopping *cheeseTopping) getPrice() int {
	return cheeseTopping.Pizza.getPrice() + 10
}
