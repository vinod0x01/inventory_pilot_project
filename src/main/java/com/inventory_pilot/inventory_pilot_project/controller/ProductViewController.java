package com.inventory_pilot.inventory_pilot_project.controller;

import com.inventory_pilot.inventory_pilot_project.entities.ProductView;
import com.inventory_pilot.inventory_pilot_project.service.ProductViewServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
public class ProductViewController {

    @Autowired
    private ProductViewServiceimpl productViewServiceimpl;

    /*@GetMapping("/productsData/{offset}")
    public List<ProductView> fetchData(@PathVariable int offset){
        return productViewServiceimpl.fetchData(offset);
    }
    */

    @GetMapping("/sort/{sort_param}/{order}/{offset}")
    public List<ProductView> fetchDataBy(@PathVariable String sort_param, @PathVariable String order,
                                         @PathVariable int offset){
        return productViewServiceimpl.filter_data(sort_param, order, offset);
    }

}
