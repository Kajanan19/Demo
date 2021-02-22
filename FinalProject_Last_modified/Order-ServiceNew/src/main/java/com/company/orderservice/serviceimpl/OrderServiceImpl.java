package com.company.orderservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.company.orderdervice.common.Payment;
import com.company.orderdervice.common.TransactionRequest;
import com.company.orderdervice.common.TransactionResponse;
import com.company.orderservice.model.Order;
import com.company.orderservice.repository.OrderRepository;
import com.company.orderservice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public TransactionResponse saveOrder(TransactionRequest request) {
		// TODO Auto-generated method stub
		
		String response="";
		Order order= request.getOrder();
		Payment payment=request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		
	    Payment paymentResponse=restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		
		response=paymentResponse.getPaymentStatus().equals("success")?"Payment processing successfull, order placed":"there is a failure in payment api, order added to cart";
	    orderRepository.save(order);
	    return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(), response);
	}

}
