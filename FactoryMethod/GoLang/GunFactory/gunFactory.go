package main

import "fmt"

type GunType int

const (
	AK47 GunType = iota
	MUSKET
)

func GetGun(gunType GunType) (IGun, error) {
	if gunType == AK47 {
		return newAk47(), nil
	}
	if gunType == MUSKET {
		return newMusket(), nil
	}
	return nil, fmt.Errorf("Wrong gun type passed")
}
