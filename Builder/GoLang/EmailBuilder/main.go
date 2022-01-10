package main

import (
	"strings"
)

type email struct {
	from, to, subject, body string
}

type EmailBuilder struct {
	email email
}

func (b *EmailBuilder) From(from string) *EmailBuilder {
	if !strings.Contains(from, "@") {
		panic("email should contain @")
	}
	b.email.from = from
	return b
}

func (b *EmailBuilder) To(to string) *EmailBuilder {
	if !strings.Contains(to, "@") {
		panic("email should contain @")
	}
	b.email.to = to
	return b
}

func (b *EmailBuilder) Subject(subject string) *EmailBuilder {
	b.email.subject = subject
	return b
}

func (b *EmailBuilder) Body(body string) *EmailBuilder {
	b.email.body = body
	return b
}

func SendEmailImpl(email *email) {
	// actually ends the email
}

type build func(builder *EmailBuilder)

func sendEmail(action build) {
	builder := EmailBuilder{}
	action(&builder)
	SendEmailImpl(&builder.email)
}

func main() {
	sendEmail(func(builder *EmailBuilder) {
		builder.From("foo@gmail.com").
			To("foo2@gmail.com").
			Subject("Meeting").
			Body("Hello foo.")
	})
}
