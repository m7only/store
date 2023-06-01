package org.m7.store.controller;

import lombok.RequiredArgsConstructor;
import org.m7.store.dto.ProductDto;
import org.m7.store.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor

public class StoreController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDTO) {
        return ResponseEntity.of(productService.add(productDTO));
    }

//    @PatchMapping("/{productId}")
//    public ResponseEntity<ProductDTO> updateProduct(@PathVariable Long productId,
//                                                    @RequestBody ProductDTO productDTO) {
//
//    }
//
//    @GetMapping("/{productType}")
//    public ResponseEntity<List<ProductDTO>> getProductsByType(@PathVariable ProductType productType) {
//
//    }
//
//    @GetMapping("/{productId}")
//    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long productId) {
//
//    }
}
