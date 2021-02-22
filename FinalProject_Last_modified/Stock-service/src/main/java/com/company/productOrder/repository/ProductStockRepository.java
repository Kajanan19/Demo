package com.company.productOrder.repository;

import org.springframework.data.repository.CrudRepository;

import com.company.productOrder.model.ProductStock;

import java.util.Optional;

public interface ProductStockRepository extends CrudRepository<ProductStock, Long> {

    Optional<ProductStock> findByProductId(Long id);
}
