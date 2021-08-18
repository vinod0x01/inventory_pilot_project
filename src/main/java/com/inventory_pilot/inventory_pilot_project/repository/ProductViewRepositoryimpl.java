package com.inventory_pilot.inventory_pilot_project.repository;

import com.inventory_pilot.inventory_pilot_project.entities.ProductView;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Locale;

/* Repository for view created */

@Repository
public class ProductViewRepositoryimpl{

    @PersistenceContext
    private EntityManager entityManager;

    private String column_list = "product_code, product_description, category_name, price, currency, inventery_available, location";

    public List<ProductView> fetchAllData(String sort_param, String ord, int offset) {

        sort_param = sort_param.toLowerCase(Locale.ROOT);
        ord = ord.toLowerCase(Locale.ROOT);

        return (List<ProductView>) entityManager.createNativeQuery("select "+column_list+" from product_view" +
                        " order by "+sort_param+" "+ord+" offset "+offset,
                ProductView.class).setMaxResults(10).getResultList();
    }

    public List<ProductView> fetchData(int offset){
        return (List<ProductView>) entityManager.createNativeQuery("select "+
                column_list+" from product_view offset "+offset,
                ProductView.class).setMaxResults(10).getResultList();
    }

}
