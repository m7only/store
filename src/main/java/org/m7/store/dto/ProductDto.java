package org.m7.store.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String serialNumber;
    private String manufacturer;
    private Double price;
    private Integer quantity;
    private String productType;
    private String additionalProperty;
    private String additionalPropertyValue;
}
