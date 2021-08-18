package com.inventory_pilot.inventory_pilot_project.repository;

import com.inventory_pilot.inventory_pilot_project.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Repository for Stock table */

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
