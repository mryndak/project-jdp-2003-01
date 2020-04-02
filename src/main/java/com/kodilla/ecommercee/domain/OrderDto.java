package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class OrderDto {
    private Long orderId;
    private Long cartId;
    private Long userId;
    private final LocalDate orderDate = LocalDate.now();
    private LocalDate deliveryDate;
    private DeliveryType deliveryType;
    private PaymentType paymentType;
    private OrderStatus orderStatus;
}
