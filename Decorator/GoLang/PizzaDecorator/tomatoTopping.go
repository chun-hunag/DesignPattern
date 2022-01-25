package main

type tomatoTopping struct {
	Pizza Pizza
}

func (tomatoTopping *tomatoTopping) getPrice() int {
	return tomatoTopping.Pizza.getPrice() + 7
}
