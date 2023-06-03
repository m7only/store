package org.m7.store.service.impl;

import org.m7.store.entity.ProductType;
import org.m7.store.repository.ProductTypeRepository;
import org.m7.store.service.ProductTypeService;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    private final ProductTypeRepository productTypeRepository;

    public ProductTypeServiceImpl(ProductTypeRepository productTypeRepository) {
        this.productTypeRepository = productTypeRepository;
    }

    @Override
    public ProductType findByTitle(String title) {
        return productTypeRepository.findByTitle(title).orElse(null);
    }

    @Override
    public ProductType add(String title) {
        return productTypeRepository.save(new ProductType(title));
    }
}
