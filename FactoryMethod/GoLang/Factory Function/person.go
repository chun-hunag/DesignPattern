package main

type Person struct {
	Name string
	Age  int
}

// factory function
//func NewPerson(name string, age int) Person {
//  return Person{name, age}
//}

func NewPerson(name string, age int) *Person {
	return &Person{name, age}
}
