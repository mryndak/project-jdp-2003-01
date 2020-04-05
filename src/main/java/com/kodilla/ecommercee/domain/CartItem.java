package com.kodilla.ecommercee.domain;

import lombok.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.persistence.*;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="CART_ITEM")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="PRODUCT_ID")
    private Long productId;

    @Column(name="PRODUCT_NAME")
    private String productName;

    @Column(name="PRICE_DATE")
    private LocalDate priceDate;

    @Column(name="PRODUCT_COUNT")
    private Long productCount;

    @Column(name="ADDED_DATE")
    private LocalDate addedDate;

    @ManyToOne
    @JoinColumn(name="CART_ID")
    private Cart cart;

}
