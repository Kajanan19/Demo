package com.company.orderservice.service;

import com.company.orderdervice.common.TransactionRequest;
import com.company.orderdervice.common.TransactionResponse;

public interface OrderService {

	public TransactionResponse saveOrder(TransactionRequest request);
}
