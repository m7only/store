package org.m7.store.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {
    private Long id;
    @NotEmpty
    private String serialNumber;
    @NotEmpty
    private String manufacturer;
    @PositiveOrZero
    private Double price;
    private Integer quantity;
    @NotEmpty
    private String productType;
    @NotEmpty
    private String additionalProperty;
    @NotEmpty
    private String additionalPropertyValue;
}
