package main

import "fmt"

type Lfu struct {
}

func (l *Lfu) Evict(cache *Cache) {
	fmt.Println("Evicting by lfu strategy")
}
