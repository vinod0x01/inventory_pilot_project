package com.inventory_pilot.inventory_pilot_project.controller;

import com.inventory_pilot.inventory_pilot_project.entities.Product;
import com.inventory_pilot.inventory_pilot_project.entities.ProductView;
import com.inventory_pilot.inventory_pilot_project.service.ProductServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServiceimpl productServiceimpl;

    /* Functional API to fetch the Product details*/
    @GetMapping("/productsOnly")
    public List<Product> fetchProducts() {
        return productServiceimpl.fetchProducts();
    }

}
