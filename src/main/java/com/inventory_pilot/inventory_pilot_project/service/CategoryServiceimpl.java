package com.inventory_pilot.inventory_pilot_project.service;

import com.inventory_pilot.inventory_pilot_project.entities.Category;
import com.inventory_pilot.inventory_pilot_project.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* Service class for Category*/

@Service
public class CategoryServiceimpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> fetchCategoryList() {
        return categoryRepository.findAll();
    }
}
