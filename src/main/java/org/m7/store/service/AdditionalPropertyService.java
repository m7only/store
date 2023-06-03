package org.m7.store.service;

import org.m7.store.entity.AdditionalProperty;

public interface AdditionalPropertyService {
    AdditionalProperty findByTitle(String title);

    AdditionalProperty add(String title);
}
