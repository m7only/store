package org.m7.store.mapper.impl;

import org.m7.store.dto.ProductDto;
import org.m7.store.entity.AdditionalProperty;
import org.m7.store.entity.Product;
import org.m7.store.entity.ProductType;
import org.m7.store.mapper.ProductMapper;
import org.m7.store.service.AdditionalPropertyService;
import org.m7.store.service.ProductTypeService;
import org.springframework.stereotype.Service;

@Service
public class ProductMapperImpl implements ProductMapper {
    private final ProductTypeService productTypeService;
    private final AdditionalPropertyService additionalPropertyService;

    public ProductMapperImpl(ProductTypeService productTypeService,
                             AdditionalPropertyService additionalPropertyService) {
        this.productTypeService = productTypeService;
        this.additionalPropertyService = additionalPropertyService;
    }

    @Override
    public Product toEntity(ProductDto productDto) {
//        AdditionalProperty additionalProperty = new AdditionalProperty();
//        ProductType productType = new ProductType();
//        additionalProperty.setTitle(productDto.getAdditionalProperty());
//        productType.setTitle(productDto.getProductType());

        AdditionalProperty additionalProperty = additionalPropertyService.findByTitle(productDto.getAdditionalProperty());
        ProductType productType = productTypeService.findByTitle(productDto.getProductType());

        if (productType == null) {
            productType = new ProductType(productDto.getProductType());
        }
        if (additionalProperty == null) {
            additionalProperty = new AdditionalProperty(productDto.getAdditionalProperty());
        }

        return new Product(
                productDto.getId(),
                productDto.getSerialNumber(),
                productDto.getManufacturer(),
                productDto.getPrice(),
                productDto.getQuantity(),
                productType,
                additionalProperty,
                productDto.getAdditionalPropertyValue()
        );
    }

    @Override
    public ProductDto toDto(Product product) {
        return new ProductDto(
                product.getId(),
                product.getSerialNumber(),
                product.getManufacturer(),
                product.getPrice(),
                product.getQuantity(),
                product.getProductType().getTitle(),
                product.getAdditionalProperty().getTitle(),
                product.getAdditionalPropertyValue()
        );
    }
}
