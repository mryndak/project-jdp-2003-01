package com.kodilla.ecommercee.domain;

import java.time.LocalDate;

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
        createDeliveryDate(4);
    }

    private LocalDate createOrderDate() {
        this.orderDate = LocalDate.now();
        return orderDate;
    }

    private LocalDate createDeliveryDate(int days) {
        this.deliveryDate = orderDate.plusDays(days);
        return deliveryDate;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getCartId() {
        return cartId;
    }

    public Long getUserId() {
        return userId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
