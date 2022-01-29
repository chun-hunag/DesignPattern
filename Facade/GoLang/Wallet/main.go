package main

import (
	"fmt"
	"log"
)

func main() {
	fmt.Println()
	WalletFacade := newWalletFacade("abc", 1234)
	fmt.Println()

	err := WalletFacade.addMoneyToWallet("abc", 1234, 10)
	if err != nil {
		log.Fatalf("Error: %s\n", err.Error())
	}

	fmt.Println()
	err = WalletFacade.deductMoneyFromWallet("abc", 1234, 5)
	if err != nil {
		log.Fatalf("Error: %s\n", err.Error())
	}
}
