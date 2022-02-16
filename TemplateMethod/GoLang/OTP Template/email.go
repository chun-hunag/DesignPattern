package main

import "fmt"

type Email struct {
	Otp
}

func (e Email) GenRandomOTP(len int) string {
	randomOTP := "1234"
	fmt.Printf("EMAIL: generating random otp %s\n", randomOTP)
	return randomOTP
}

func (e Email) SaveOPTCache(otp string) {
	fmt.Printf("EMAIL: saving otp: %s to cache\n", otp)
}

func (e Email) GetMessage(otp string) string {
	return "EMAIL OTP for login is " + otp
}

func (e Email) SendNotification(message string) error {
	fmt.Printf("EMAIL: sending email: %s\n", message)
	return nil
}

func (e Email) PublishMetric() {
	fmt.Printf("EMAIL: publishing metrics\n")
}
