package com.inventory_pilot.inventory_pilot_project.controller;

import com.inventory_pilot.inventory_pilot_project.entities.Stock;
import com.inventory_pilot.inventory_pilot_project.service.StockServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*RestController class to get the Data by stock available*/
@RestController
public class StockController {

    @Autowired
    private StockServiceimpl stockServiceimpl;

    /*Function for fetching the stock by service layer*/
    @GetMapping("/stocks")
    public List<Stock> fetchStocks(){
        return stockServiceimpl.fetchStocks();
    }
}
