package com.company.paymentservice.serviceimpl;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.paymentservice.model.Payment;
import com.company.paymentservice.repository.PaymentRepository;
import com.company.paymentservice.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment doPayment(Payment payment) {
		// TODO Auto-generated method stub
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepository.save(payment);
	}
	
	public String paymentProcessing() {
		return new Random().nextBoolean()?"success":"failure";
	}
	
	@Override
	public Payment findPaymentHistoryByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return paymentRepository.findByOrderId(orderId);
	}
}
