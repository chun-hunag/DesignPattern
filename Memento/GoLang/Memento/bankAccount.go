package main

type BankAccount struct {
	balance int
}

func (b *BankAccount) Deposit(amount int) *Memento {
	b.balance += amount
	return &Memento{b.balance}
}

func (b *BankAccount) Restore(memento *Memento) {
	b.balance = memento.Balance
}
