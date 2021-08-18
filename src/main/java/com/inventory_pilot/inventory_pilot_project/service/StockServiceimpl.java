package com.inventory_pilot.inventory_pilot_project.service;

import com.inventory_pilot.inventory_pilot_project.entities.Stock;
import com.inventory_pilot.inventory_pilot_project.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* Service class for stock*/

@Service
public class StockServiceimpl implements StockService{

    @Autowired
    private StockRepository stockRepository;

    @Override
    public List<Stock> fetchStocks() {
        return stockRepository.findAll();
    }
}
