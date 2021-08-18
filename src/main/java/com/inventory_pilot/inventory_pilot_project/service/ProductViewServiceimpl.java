package com.inventory_pilot.inventory_pilot_project.service;

import com.inventory_pilot.inventory_pilot_project.entities.ProductView;
import com.inventory_pilot.inventory_pilot_project.repository.ProductViewRepositoryimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductViewServiceimpl implements ProductViewService {

    @Autowired
    private  ProductViewRepositoryimpl productViewRepositoryimpl;

    @Override
    public List<ProductView> fetchData(int offset) {
        return null;
    }

    @Override
    public List<ProductView> filter_data(String column, String order, int offset) {
        return productViewRepositoryimpl.fetchAllData(column, order, offset);
    }

}
