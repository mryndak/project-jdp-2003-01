package com.kodilla.ecommercee.domain;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String productName;
    private Long groupId;
    private String description;
    private int quantity;
    private BigDecimal price;

}
