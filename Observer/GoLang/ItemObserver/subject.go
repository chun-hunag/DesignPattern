package main

type subject interface {
	Register(observer Observer)
	Deregister(observer Observer)
	NotifyAll()
}
