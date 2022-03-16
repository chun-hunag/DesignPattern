package main

type OnCommand struct {
	device Device
}

func (o *OnCommand) Execute() {
	o.device.On()
}
