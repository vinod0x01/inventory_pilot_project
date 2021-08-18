package com.inventory_pilot.inventory_pilot_project.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/* Table Stock from database*/

@Entity
@Table(name = "stock")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stock implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "location")
    private String location;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_code")
    //@Column(name = "product_code")
    private Product product_code;

    @Column(name = "inventery_available")
    private Long inventery_available;
}
