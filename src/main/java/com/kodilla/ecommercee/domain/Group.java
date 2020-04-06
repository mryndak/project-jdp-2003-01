package com.kodilla.ecommercee.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="GROUP_PRODUCT")
public class Group {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="GROUP_ID")
    private Long id;

    @Column(name="GROUP_NAME")
    private String groupName;

    @Column(name="DESCRIPTION")
    private String description;

    @OneToMany(
            targetEntity = Product.class,
            cascade = CascadeType.ALL,
            mappedBy = "group",
            fetch = FetchType.LAZY
    )
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
}
