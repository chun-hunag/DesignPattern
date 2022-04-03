package main

import (
	"fmt"
)

type BrandType int

const (
	ADIDAS BrandType = iota
	NIKE
)

type ISportsFactory interface {
	MakeShoe() IShoes
	MakeShirt() IShirt
}

func GetSportsFactory(brand BrandType) (ISportsFactory, error) {
	if brand == ADIDAS {
		return &AdidasFactory{}, nil
	}

	if brand == NIKE {
		return &NikeFactory{}, nil
	}

	return nil, fmt.Errorf("Wrong brand type passed")
}
