package com.inventory_pilot.inventory_pilot_project.controller;

import com.inventory_pilot.inventory_pilot_project.entities.Price;
import com.inventory_pilot.inventory_pilot_project.service.PriceServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*RestController class to get the Price data*/
@RestController
public class PriceController {

    @Autowired
    private PriceServiceimpl priceServiceimpl;

    /* Function for fetching the price data by service layer*/
    @GetMapping("/prices")
    public List<Price> fetchPrices(){
        return priceServiceimpl.fetchPrices();
    };
}
