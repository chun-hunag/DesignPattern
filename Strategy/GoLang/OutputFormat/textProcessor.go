package main

import "strings"

type TextProcessor struct {
	builder      strings.Builder
	ListStrategy ListStrategy
}

func NewTextProcessor(strategy ListStrategy) *TextProcessor {
	return &TextProcessor{strings.Builder{}, strategy}
}

func (p *TextProcessor) SetOutputFormat(format OutputFormat) {
	switch format {
	case Markdown:
		p.ListStrategy = &MarkdownListStrategy{}
		break
	case Html:
		p.ListStrategy = &HtmlListStrategy{}
		break
	}
}

func (p *TextProcessor) AppendList(items []string) {
	p.ListStrategy.Start(&p.builder)
	for _, item := range items {
		p.ListStrategy.AddListItem(&p.builder, item)
	}
	p.ListStrategy.End(&p.builder)
}

func (p *TextProcessor) Reset() {
	p.builder.Reset()
}

func (p *TextProcessor) String() string {
	return p.builder.String()
}
