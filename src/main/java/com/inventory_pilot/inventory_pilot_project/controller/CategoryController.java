package com.inventory_pilot.inventory_pilot_project.controller;

import com.inventory_pilot.inventory_pilot_project.entities.Category;
import com.inventory_pilot.inventory_pilot_project.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /*Function for returning the Category list on get apu call*/
    @GetMapping("/category")
    public List<Category> fetchCategory(){
        return categoryService.fetchCategoryList();
    }
}
