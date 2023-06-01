package org.m7.store.service;

import org.m7.store.dto.ProductDto;

import java.util.Optional;

public interface ProductService {
    Optional<ProductDto> add(ProductDto productDTO);
}
