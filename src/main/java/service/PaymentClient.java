package service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import common.Payment;

public interface PaymentClient {
	@PostMapping(value = "/payment/makePayment")
	Payment makePayment(@RequestBody Payment payment);
}
