package com.inventory_pilot.inventory_pilot_project.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @Column(name = "product_code")
    private String product_code;

    @Column(name = "product_description")
    private String product_description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category")
    //@Column(name = "category")
    private Category category;
}
