package com.kodilla.ecommercee.domain;


import lombok.*;

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


    private String productName;


    private String description;

    @Column(name="QUANTITY")
    private int quantity;

    @Column(name="PRICE")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name="GROUP_ID")
    private Group group;
}
