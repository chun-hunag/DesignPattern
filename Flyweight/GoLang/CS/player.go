package main

type Player struct {
	dress      Dress
	playerType string
	lat        int
	lng        int
}

func NewPlayer(playerType, dressType string) *Player {
	dress, _ := getDressFactorySingleInstance().getDressByType(dressType)
	return &Player{
		dress:      dress,
		playerType: playerType,
	}
}

func (p *Player) NewLocation(lat, lng int) {
	p.lat = lat
	p.lng = lng
}
