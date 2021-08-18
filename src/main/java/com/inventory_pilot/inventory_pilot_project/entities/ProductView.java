package com.inventory_pilot.inventory_pilot_project.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Subselect(""+
                "select pd.product_code, pd.product_description, ca.category_name, pr.price, pr.currency, st.inventery_available, st.location " +
                "from category ca " +
                "inner join product as pd " +
                "on ca.category_code = pd.category " +
                "left join price as pr " +
                "on pr.product_code = pd.product_code " +
                "inner join stock st " +
                "on st.product_code = pr.product_code; "
)
@Data
@Table(name = "product_view")
public class ProductView {

    @Id
    @Column(name = "product_code")
    private String product_code;

    @Column(name = "product_description")
    private String product_description;

    @Column(name = "category_name")
    private String category_name;

    @Column(name = "price")
    private int price;

    @Column(name = "currency")
    private String currency;

    @Column(name = "inventery_available")
    private int inventory_available;

    @Column(name = "location")
    private String location;

}
