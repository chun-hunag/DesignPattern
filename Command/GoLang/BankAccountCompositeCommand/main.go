package main

import "fmt"

func main() {
	ba := &BankAccount{}
	cmdDeposit := NewBankAccountCommand(ba, Deposit, 100)
	cmdWithdraw := NewBankAccountCommand(ba, Withdraw, 1000)
	cmdDeposit.Call()
	cmdWithdraw.Call()
	fmt.Println(ba)
	cmdWithdraw.Undo()
	cmdDeposit.Undo()
	fmt.Println(ba)

	from := BankAccount{100}
	to := BankAccount{0}
	mtc := NewMoneyTransferCommand(&from, &to, 100) // try 1000
	mtc.Call()

	fmt.Println("from=", from, "to=", to)

	fmt.Println("Undoing...")
	mtc.Undo()
	fmt.Println("from=", from, "to=", to)
}
