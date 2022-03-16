package main

type OffCommand struct {
	device Device
}

func (o *OffCommand) Execute() {
	o.device.Off()
}
