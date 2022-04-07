package main

type NikeFactory struct {
}

func (n *NikeFactory) MakeShoe() IShoes {
	return &NikeShoes{
		Shoes: Shoes{
			logo: "nike",
			size: 14,
		},
	}
}

func (n *NikeFactory) MakeShirt() IShirt {
	return &NikeShirt{
		Shirt: Shirt{
			logo: "nike",
			size: 14,
		},
	}
}
