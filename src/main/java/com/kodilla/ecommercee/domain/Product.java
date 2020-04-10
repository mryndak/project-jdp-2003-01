package com.kodilla.ecommercee.domain;



import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @ManyToOne
    @JoinColumn(name="GROUP_ID")
    private Group group;

    @ManyToOne
    @JoinColumn(name="CART_ITEM_ID")
    private CartItem cartItem;

    @Column(name="PRODUCT_NAME")
    private String productName;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="QUANTITY")
    private int quantity;

    @Column(name="PRICE")
    private BigDecimal price;


}
