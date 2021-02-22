package com.company.productOrder.service.mapper;

import org.mapstruct.Mapper;

import com.company.productOrder.dto.ProductStockDTO;
import com.company.productOrder.model.ProductStock;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductStockMapper {

    ProductStockDTO toDTO(ProductStock productStock);

    List<ProductStockDTO> toDTOs(List<ProductStock> productStocks);

    ProductStock toEntity(ProductStockDTO productStockDTO);
}
