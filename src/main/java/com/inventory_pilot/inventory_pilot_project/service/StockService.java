package com.inventory_pilot.inventory_pilot_project.service;


import com.inventory_pilot.inventory_pilot_project.entities.Stock;


import java.util.List;

public interface StockService {

    List<Stock> fetchStocks();
}
