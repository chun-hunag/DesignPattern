package main

func main() {
	car := NewCarProxy(&Driver{22})
	car.Drive()

	car2 := NewCarProxy(&Driver{15})
	car2.Drive()
}
