package main

func main() {
	tv := &TV{}

	onCommand := &OnCommand{device: tv}

	offCommand := &OffCommand{device: tv}

	onButton := &Button{command: onCommand}

	offButton := &Button{command: offCommand}

	onButton.Press()
	offButton.Press()
}
