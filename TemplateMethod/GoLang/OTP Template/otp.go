package main

type IOtp interface {
	GenRandomOTP(int) string
	SaveOPTCache(string)
	GetMessage(string) string
	SendNotification(string) error
	PublishMetric()
}

type Otp struct {
	iOtp IOtp
}

func (o *Otp) GenAndSendOTP(otpLength int) error {
	otp := o.iOtp.GenRandomOTP(otpLength)
	o.iOtp.SaveOPTCache(otp)
	message := o.iOtp.GetMessage(otp)
	err := o.iOtp.SendNotification(message)
	if err != nil {
		return err
	}
	o.iOtp.PublishMetric()
	return nil
}
