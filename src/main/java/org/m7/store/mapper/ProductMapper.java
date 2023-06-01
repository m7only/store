package org.m7.store.mapper;

import org.m7.store.dto.ProductDto;
import org.m7.store.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

public interface ProductMapper {
    Product toEntity(ProductDto productDto);
    ProductDto toDto(Product product);
}
