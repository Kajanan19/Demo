package com.company.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.comons.customer.Customer;
import com.company.customerservice.dto.CustomerRequest;
import com.company.customerservice.serviceimpl.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@PostMapping(value = "/customer")
	public Customer makeOrder(@RequestBody CustomerRequest customerRequest){
		return customerServiceImpl.makeOrder(customerRequest.getCustomer());
	}
}
