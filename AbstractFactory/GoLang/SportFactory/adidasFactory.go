package main

type AdidasFactory struct {
}

func (a *AdidasFactory) MakeShoe() IShoes {
	return &AdidasShoe{
		Shoes: Shoes{
			logo: "adidas",
			size: 14,
		},
	}
}

func (a *AdidasFactory) MakeShirt() IShirt {
	return &AdidasShirt{
		Shirt: Shirt{
			logo: "adidas",
			size: 14,
		},
	}
}
