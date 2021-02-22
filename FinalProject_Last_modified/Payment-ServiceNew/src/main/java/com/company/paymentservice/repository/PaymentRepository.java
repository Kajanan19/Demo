package com.company.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.paymentservice.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

	Payment findByOrderId(int orderId);

}
