package com.kodilla.ecommercee.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CART_ITEM")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRICE_DATE")
    private LocalDate priceDate;

    @Column(name = "PRODUCT_COUNT")
    private Long productCount;

    @Column(name = "ADDED_DATE")
    private LocalDate addedDate;

    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "cartItem",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Product> products = new ArrayList<>();

    @ManyToOne
    private Cart cart;

}