package main

import "fmt"

type Lru struct {
}

func (l *Lru) Evict(cache *Cache) {
	fmt.Println("Evicting by Lru strategy")
}
