package main

import (
	"fmt"
	"strings"
)

type Expression interface {
	Print(sb *strings.Builder)
}

type DoubleExpression struct {
	value float64
}

func (d *DoubleExpression) Print(sb *strings.Builder) {
	sb.WriteString(fmt.Sprintf("%g", d.value))
}

type AdditionExpression struct {
	left, right Expression
}

func (a *AdditionExpression) Print(sb *strings.Builder) {
	sb.WriteString("(")
	a.left.Print(sb)
	sb.WriteString("+")
	a.right.Print(sb)
	sb.WriteString(")")
}
