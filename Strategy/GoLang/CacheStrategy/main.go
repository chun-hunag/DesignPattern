package main

func main() {
	lfu := &Lfu{}
	cache := initCache(lfu)

	cache.Add("a", "1")
	cache.Add("b", "2")

	cache.Add("c", "3")

	lru := &Lru{}
	cache.SetEvictionAlgo(lru)

	cache.Add("d", "4")

	fifo := &Fifo{}
	cache.SetEvictionAlgo(fifo)

	cache.Add("e", "5")
}
