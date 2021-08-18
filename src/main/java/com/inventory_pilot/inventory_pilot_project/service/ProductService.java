package com.inventory_pilot.inventory_pilot_project.service;


import com.inventory_pilot.inventory_pilot_project.entities.Product;
import com.inventory_pilot.inventory_pilot_project.entities.ProductView;

import java.util.List;

public interface ProductService {

    /* Function for returning all tha product from table*/
    List<Product> fetchProducts();
}
