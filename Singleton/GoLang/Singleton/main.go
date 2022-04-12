package main

import "fmt"

func main() {
	db := GetSingletonDatabase()
	pop := db.GetPopulation("Seoul")
	fmt.Println("Pop of Seoul = ", pop)

	cities := []string{"Seoul", "Mexico City"}
	//tp := GetTotalPopulation(cities)
	tp := GetTotalPopulationEx(GetSingletonDatabase(), cities)

	ok := tp == (17500000 + 17400000) // testing on live data
	fmt.Println(ok)

	names := []string{"alpha", "gamma"} // expect 4
	tp = GetTotalPopulationEx(&DummyDatabase{}, names)
	ok = tp == 4
	fmt.Println(ok)
}
