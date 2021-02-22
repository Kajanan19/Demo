package com.company.paymentservice.service;

import com.company.paymentservice.model.Payment;

public interface PaymentService {

	public Payment doPayment(Payment payment);
	public Payment findPaymentHistoryByOrderId(int orderId);
}
