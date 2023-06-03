package org.m7.store.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@Entity
@EqualsAndHashCode
@Table(name = "additional_properties")
public class AdditionalProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    public AdditionalProperty(String title) {
        this.title = title;
    }
}
