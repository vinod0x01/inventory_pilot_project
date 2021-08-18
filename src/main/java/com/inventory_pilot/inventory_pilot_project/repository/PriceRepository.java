package com.inventory_pilot.inventory_pilot_project.repository;

import com.inventory_pilot.inventory_pilot_project.entities.Price;
import com.inventory_pilot.inventory_pilot_project.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Repository for Price table */

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

}
