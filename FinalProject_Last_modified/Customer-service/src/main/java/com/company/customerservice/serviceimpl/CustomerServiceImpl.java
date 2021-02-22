package com.company.customerservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.comons.customer.Customer;
import com.company.customerservice.repository.CustomerRepository;
import com.company.customerservice.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer makeOrder(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	
}
