package org.m7.store.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.m7.store.dto.ProductDto;
import org.m7.store.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor

public class StoreController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> addProduct(@RequestBody @Valid ProductDto productDTO) {
        return ResponseEntity.ofNullable(productService.add(productDTO));
    }

    @PatchMapping
    public ResponseEntity<ProductDto> updateProduct(@RequestBody @Valid ProductDto productDTO) {
        return ResponseEntity.ofNullable(productService.update(productDTO));
    }

    @GetMapping("/product_types/{productTypeId}")
    public ResponseEntity<List<ProductDto>> getProductsByType(@PathVariable Long productTypeId) {
        return ResponseEntity.ofNullable(productService.getProductsByProductTypeId(productTypeId));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long productId) {
        return ResponseEntity.ofNullable(productService.getById(productId));
    }
}
