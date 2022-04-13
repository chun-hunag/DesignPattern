package main

import "fmt"

func main() {
	//   1
	//  / \
	// 2   3

	// in-order:  213
	// preorder:  123
	// postorder: 231

	root := NewNode(1,
		NewTerminalNode(2),
		NewTerminalNode(3))
	it := NewInOrderIterator(root)

	for it.MoveNext() {
		fmt.Printf("%d,", it.Current.Value)
	}
	fmt.Println("\b")

	t := NewBinaryTree(root)
	for i := t.InOrder(); i.MoveNext(); {
		fmt.Printf("%d,", i.Current.Value)
	}
	fmt.Println("\b")
}
