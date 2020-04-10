package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartItemDto {
    private Long id;
    private Long productId;
    private Long cartId;
    private String productName;
    private LocalDate priceDate;
    private Long productCount;
    private LocalDate addedDate;
}
