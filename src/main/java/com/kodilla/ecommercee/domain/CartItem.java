package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartItem {
    private Long id;
    private Long productId;
    private String productName;
    private LocalDate priceDate;
    private Long productCount;
    private LocalDate addedDate;
}
