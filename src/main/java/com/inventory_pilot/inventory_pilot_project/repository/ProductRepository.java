package com.inventory_pilot.inventory_pilot_project.repository;

import com.inventory_pilot.inventory_pilot_project.entities.Product;
import com.inventory_pilot.inventory_pilot_project.entities.ProductView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/* Repository for Product table */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
