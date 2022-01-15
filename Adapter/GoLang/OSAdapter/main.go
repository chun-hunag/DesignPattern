package main

func main() {
	client := &client{}
	mac := &Mac{}
	client.insertLightningConnectorIntoComputer(mac)

	windowsMachine := &Windows{}
	windowsAdapter := &WindowsAdapter{
		windowsMachine: windowsMachine,
	}

	client.insertLightningConnectorIntoComputer(windowsAdapter)

}
