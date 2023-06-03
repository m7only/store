package org.m7.store.repository;

import org.m7.store.entity.AdditionalProperty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdditionalPropertyRepository extends JpaRepository<AdditionalProperty, Long> {
    Optional<AdditionalProperty> findByTitle(String title);
}
