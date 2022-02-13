package main

func main() {
	p := NewPerson("Boris")
	ds := &DoctorService{}
	p.Subscribe(ds)

	// let's test it!
	p.CatchACold()
}
