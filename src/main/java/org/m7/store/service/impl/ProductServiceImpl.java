package org.m7.store.service.impl;

import jakarta.transaction.Transactional;
import org.m7.store.dto.ProductDto;
import org.m7.store.entity.Product;
import org.m7.store.mapper.ProductMapper;
import org.m7.store.repository.ProductRepository;
import org.m7.store.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductMapper productMapper,
                              ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public ProductDto add(ProductDto productDTO) {
        Product product = productMapper.toEntity(productDTO);
        return productMapper.toDto(productRepository.save(product));
    }

    @Override
    public ProductDto update(ProductDto productDto) {
        Product product = productMapper.toEntity(productDto);
        if (product.getId() == null) {
            return null;
        }
        if (productRepository.findById(product.getId()).isEmpty()) {
            return null;
        }
        return productMapper.toDto(productRepository.save(product));
    }

    @Override
    public List<ProductDto> getProductsByProductTypeId(Long productTypeId) {
        return productRepository
                .findByProductTypeId(productTypeId)
                .stream()
                .map(product -> productMapper.toDto(product))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto getById(Long productId) {
        Optional<Product> optional = productRepository.findById(productId);
        if (optional.isEmpty()) {
            return null;
        }
        return productMapper.toDto(optional.get());
    }
}
