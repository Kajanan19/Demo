package com.company.productOrder.service;

import java.util.List;
import java.util.Optional;

import com.company.productOrder.dto.ProductStockDTO;

public interface ProductStockService {

    Optional<ProductStockDTO> findById(Long id);

    Optional<ProductStockDTO> findByProductId(Long id);

    List<ProductStockDTO> findAll();

    void deleteById(Long id);

    List<ProductStockDTO> init(int multiplier);

    ProductStockDTO save(ProductStockDTO productStock);
}
