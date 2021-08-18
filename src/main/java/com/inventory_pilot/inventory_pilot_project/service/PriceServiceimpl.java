package com.inventory_pilot.inventory_pilot_project.service;

import com.inventory_pilot.inventory_pilot_project.entities.Price;
import com.inventory_pilot.inventory_pilot_project.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceServiceimpl implements PriceService{

    @Autowired
    private PriceRepository priceRepository;

    @Override
    public List<Price> fetchPrices() {
        return priceRepository.findAll();
    }
}
