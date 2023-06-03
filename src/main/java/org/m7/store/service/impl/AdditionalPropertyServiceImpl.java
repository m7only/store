package org.m7.store.service.impl;

import org.m7.store.entity.AdditionalProperty;
import org.m7.store.repository.AdditionalPropertyRepository;
import org.m7.store.service.AdditionalPropertyService;
import org.springframework.stereotype.Service;

@Service
public class AdditionalPropertyServiceImpl implements AdditionalPropertyService {
    private final AdditionalPropertyRepository additionalPropertyRepository;

    public AdditionalPropertyServiceImpl(AdditionalPropertyRepository additionalPropertyRepository) {
        this.additionalPropertyRepository = additionalPropertyRepository;
    }

    @Override
    public AdditionalProperty findByTitle(String title) {
        return additionalPropertyRepository.findByTitle(title).orElse(null);
    }

    @Override
    public AdditionalProperty add(String title) {
        return additionalPropertyRepository.save(new AdditionalProperty(title));
    }
}
