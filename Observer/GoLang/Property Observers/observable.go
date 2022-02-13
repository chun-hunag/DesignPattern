package main

import "container/list"

type Observable struct {
	subs *list.List
}

func (o *Observable) Subscribe(observer Observer) {
	o.subs.PushBack(observer)
}

func (o *Observable) Unsubscribe(observer Observer) {
	for z := o.subs.Front(); z != nil; z = z.Next() {
		if z.Value.(Observer) == observer {
			o.subs.Remove(z)
		}
	}
}

func (o *Observable) Fire(data interface{}) {
	for z := o.subs.Front(); z != nil; z = z.Next() {
		z.Value.(Observer).Notify(data)
	}
}
