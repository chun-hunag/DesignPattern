package main

import (
	"fmt"
	"strings"
)

func main() {
	// 1+(2+3)
	e := AdditionExpression{
		&DoubleExpression{1},
		&AdditionExpression{
			left:  &DoubleExpression{2},
			right: &DoubleExpression{3},
		},
	}
	sb := strings.Builder{}
	e.Print(&sb)
	fmt.Println(sb.String())
}
