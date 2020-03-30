package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDto {
    private Long orderId;
    private Long cartId;
    private Long userId;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private DeliveryType deliveryType;
    private PaymentType paymentType;
    private OrderStatus orderStatus;

    public OrderDto(Long orderId, Long cartId, Long userId, DeliveryType deliveryType, PaymentType paymentType, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.cartId = cartId;
        this.userId = userId;
        this.deliveryType = deliveryType;
        this.paymentType = paymentType;
        this.orderStatus = orderStatus;
        createOrderDate();
        createDeliveryDate();
    }

    private LocalDate createOrderDate() {
        this.orderDate = LocalDate.now();
        return orderDate;
    }

    private LocalDate createDeliveryDate() {
        Random random = new Random(10);
        this.deliveryDate = orderDate.plusDays(random.nextInt());
        return deliveryDate;
    }
}
