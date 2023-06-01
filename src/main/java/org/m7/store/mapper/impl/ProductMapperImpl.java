package org.m7.store.mapper.impl;

import org.m7.store.dto.ProductDto;
import org.m7.store.entity.AdditionalProperty;
import org.m7.store.entity.Product;
import org.m7.store.entity.Property;
import org.m7.store.mapper.ProductMapper;

public class ProductMapperImpl implements ProductMapper {
    @Override
    public Product toEntity(ProductDto productDto) {
        Product product = new Product();
        AdditionalProperty additionalProperty = new AdditionalProperty();
        Property property = new Property();
//        private Long id;
//        private String serialNumber;+
//        private String manufacturer;+
//        private Double price;+
//        private Integer quantity;+
//        private String productType;
//        private String additionalProperty;+
//        private String additionalPropertyValue;+
        additionalProperty.setTitle(productDto.getAdditionalProperty());

        property.setSerialNumber(property.getSerialNumber());
        property.setManufacturer(productDto.getManufacturer());
        property.setPrice(property.getPrice());
        property.setQuantity(productDto.getQuantity());

        product.setId(productDto.getId());
        product.setAdditionalPropertyValue(productDto.getAdditionalPropertyValue());
        return null;
    }

    @Override
    public ProductDto toDto(Product product) {
        return null;
    }
}
