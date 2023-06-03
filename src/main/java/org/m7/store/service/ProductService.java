package org.m7.store.service;

import org.m7.store.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto add(ProductDto productDTO);

    ProductDto update(ProductDto productDto);

    List<ProductDto> getProductsByProductTypeId(Long productTypeId);

    ProductDto getById(Long productId);
}
