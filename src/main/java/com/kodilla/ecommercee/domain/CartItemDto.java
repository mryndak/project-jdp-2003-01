package com.kodilla.ecommercee.domain;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
public class CartItemDto {
    private Long id;
    private Long productId;
    private String productName;
    private LocalDate priceDate;
    private Long productCount;
    private LocalDate addedDate;
}
