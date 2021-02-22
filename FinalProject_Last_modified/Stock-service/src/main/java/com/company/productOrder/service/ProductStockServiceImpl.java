package com.company.productOrder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.company.productOrder.dto.ProductDTO;
import com.company.productOrder.dto.ProductStockDTO;
import com.company.productOrder.model.ProductStock;
import com.company.productOrder.repository.ProductStockRepository;
import com.company.productOrder.service.mapper.ProductStockMapper;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductStockServiceImpl implements ProductStockService {

    private final ProductStockRepository productStockRepository;

    private final ProductStockMapper productStockMapper;

    private final RestTemplate restTemplate;

    @Value("${book.microservice.apiUrl}")
    private String apiUrl;

    @Override
    public Optional<ProductStockDTO> findById(Long id) {
        Optional<ProductStock> byId = productStockRepository.findById(id);
        return Optional.ofNullable(productStockMapper.toDTO(byId.orElse(null)));
    }

    @Override
    public Optional<ProductStockDTO> findByProductId(Long id) {
        Optional<ProductStock> byId = productStockRepository.findByProductId(id);
        return Optional.ofNullable(productStockMapper.toDTO(byId.orElse(null)));
    }

    @Override
    public List<ProductStockDTO> findAll() {
        return productStockMapper.toDTOs((List<ProductStock>) productStockRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        productStockRepository.deleteById(id);
    }

    @Override
    public List<ProductStockDTO> init(int multiplier) {
        productStockRepository.deleteAll();
        ProductDTO[] products = restTemplate.getForObject(apiUrl + "/products", ProductDTO[].class);
        if (products != null) {
            for (ProductDTO product : products) {
                productStockRepository.save(ProductStock.builder()
                        .productId(product.getId())
                        .available(product.getMinimumStock() * multiplier)
                        .build());
            }
        }
        return findAll();
    }

    @Override
    public ProductStockDTO save(ProductStockDTO productStock) {
        ProductStock saved = productStockRepository.save(productStockMapper.toEntity(productStock));
        return productStockMapper.toDTO(saved);
    }
}
