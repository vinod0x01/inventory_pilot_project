package com.inventory_pilot.inventory_pilot_project.service;

import com.inventory_pilot.inventory_pilot_project.entities.ProductView;

import java.util.List;

public interface ProductViewService {
    List<ProductView> fetchData(int offset);

    default List<ProductView> filter_data(String column, String order, int offset) {
        return null;
    }

}
