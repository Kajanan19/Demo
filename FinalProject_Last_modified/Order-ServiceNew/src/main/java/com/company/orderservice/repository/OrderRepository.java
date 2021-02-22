package com.company.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
