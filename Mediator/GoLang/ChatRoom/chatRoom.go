package main

type ChatRoom struct {
	people []*Person
}

func (c *ChatRoom) Broadcast(source, message string) {
	for _, p := range c.people {
		if p.Name != source {
			p.Receive(source, message)
		}
	}
}

func (c *ChatRoom) Message(src, dst, msg string) {
	for _, p := range c.people {
		if p.Name == dst {
			p.Receive(src, msg)
		}
	}
}

func (c *ChatRoom) Join(person *Person) {
	joinMsg := person.Name + " joins the chat"
	c.Broadcast("Room", joinMsg)

	person.Room = c
	c.people = append(c.people, person)
}
