package com.company.productOrder.web.api.v1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.productOrder.dto.ProductStockDTO;
import com.company.productOrder.service.ProductStockService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/product-stocks")
@RequiredArgsConstructor
@Slf4j
public class ProductStockController {

    private final ProductStockService productStockService;

    @GetMapping
    public ResponseEntity<List<ProductStockDTO>> products() {
        return ResponseEntity.ok(productStockService.findAll());
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Object> findById(@PathVariable Long productId) {
        Optional<ProductStockDTO> byId = productStockService.findByProductId(productId);
        return byId.<ResponseEntity<Object>>map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found"));
    }

    @GetMapping("/init/{multiplier}")
    public ResponseEntity<Object> init(@PathVariable int multiplier) {
        return ResponseEntity.ok(productStockService.init(multiplier));
    }
}
