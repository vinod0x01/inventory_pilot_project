package com.inventory_pilot.inventory_pilot_project.service;

import com.inventory_pilot.inventory_pilot_project.entities.Product;
import com.inventory_pilot.inventory_pilot_project.entities.ProductView;
import com.inventory_pilot.inventory_pilot_project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* Service class for product*/

@Service
public class ProductServiceimpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    /* Function for returning all tha product from table*/
    public List<Product> fetchProducts(){
        return productRepository.findAll();
    }

}
