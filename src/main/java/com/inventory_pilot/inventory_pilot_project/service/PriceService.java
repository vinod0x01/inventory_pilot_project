package com.inventory_pilot.inventory_pilot_project.service;

import com.inventory_pilot.inventory_pilot_project.entities.Price;

import java.util.List;

public interface PriceService {

    /* Function to fetch the details of Price*/
    List<Price> fetchPrices();
}
