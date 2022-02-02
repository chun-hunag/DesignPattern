package main

import "fmt"

type Fifo struct {
}

func (f *Fifo) Evict(cache *Cache) {
	fmt.Println("Evicting by fifo strategy")
}
