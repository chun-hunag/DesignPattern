package main

import "fmt"

func main() {
	tp := NewTextProcessor(&MarkdownListStrategy{})
	fmt.Println("fuck")
	tp.AppendList([]string{"foo", "bar", "baz"})
	fmt.Println(tp)

	tp.Reset()
	tp.SetOutputFormat(Html)
	tp.AppendList([]string{"foo", "bar", "baz"})
	fmt.Println(tp)
}
