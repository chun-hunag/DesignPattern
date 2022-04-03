package main

type IShoes interface {
	SetLogo(logo string)
	SetSize(size int)
	GetLogo() string
	GetSize() int
}

type Shoes struct {
	logo string
	size int
}

func (s *Shoes) SetLogo(logo string) {
	s.logo = logo
}

func (s *Shoes) GetLogo() string {
	return s.logo
}

func (s *Shoes) SetSize(size int) {
	s.size = size
}

func (s *Shoes) GetSize() int {
	return s.size
}
