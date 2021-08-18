package com.inventory_pilot.inventory_pilot_project.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/* Table Price from database*/

@Entity
@Table(name = "price")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Price implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "currency")
    private String currency;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_code")
    //@Column(name = "product_code")
    private Product product_code;

    @Column(name = "price")
    private Long price;

}
