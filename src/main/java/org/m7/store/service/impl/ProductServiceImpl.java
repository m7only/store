package org.m7.store.service.impl;

import org.m7.store.dto.ProductDto;
import org.m7.store.mapper.ProductMapper;
import org.m7.store.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public Optional<ProductDto> add(ProductDto productDTO) {

        return Optional.empty();
    }
}
