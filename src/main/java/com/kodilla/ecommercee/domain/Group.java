package com.kodilla.ecommercee.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Table
@Entity(name = "GROUP")
public class Group {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String groupName;
    @Column
    private String description;
    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "group",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Product> products = new ArrayList<>();

    public Group(Long id, String groupName, String description) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}