package com.company.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.company.comons.customer.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
