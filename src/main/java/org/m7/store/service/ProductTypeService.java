package org.m7.store.service;

import org.m7.store.entity.ProductType;

public interface ProductTypeService {
    ProductType findByTitle(String title);

    ProductType add(String title);
}
