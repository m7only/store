package org.m7.store.repository;

import org.m7.store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductTypeId(Long productTypeId);
}
