package com.inventory_pilot.inventory_pilot_project.repository;

import com.inventory_pilot.inventory_pilot_project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Repository for category table */

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
}
