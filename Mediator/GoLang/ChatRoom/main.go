package main

func main() {
	room := ChatRoom{}

	john := NewPerson("John")
	jane := NewPerson("Jane")

	room.Join(john)
	room.Join(jane)

	john.Say("hi room")
	jane.Say("oh, hey john")

	simon := NewPerson("Simon")
	room.Join(simon)
	simon.Say("hi everyone!")

	jane.PrivateMessage("Simon", "glad you could join us!")
}
