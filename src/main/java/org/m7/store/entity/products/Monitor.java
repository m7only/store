package org.m7.store.entity.products;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.m7.store.entity.Product;

@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
//@Entity
public class Monitor extends Product {

    @Column(name = "diagonal")
    private Double diagonal;
}
