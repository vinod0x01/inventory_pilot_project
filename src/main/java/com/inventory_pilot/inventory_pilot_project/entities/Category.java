package com.inventory_pilot.inventory_pilot_project.entities;

import lombok.*;

import javax.persistence.*;

/* Table Category from database*/

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @NonNull
    @Column(name = "category_code")
    private Long category_code;

    @Column(name = "category_name")
    private String category_name;
}
