package com.inventory_pilot.inventory_pilot_project.service;

import com.inventory_pilot.inventory_pilot_project.entities.ProductView;

import java.math.BigInteger;
import java.util.List;

/* Service interface for View*/

public interface ProductViewService {
    List<ProductView> fetchData(int offset);

    default List<ProductView> filter_data(String column, String order, int offset) {
        return null;
    }

    BigInteger get_counts();

}
