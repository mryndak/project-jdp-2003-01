package com.kodilla.ecommercee.domain;

import org.joda.time.DateTime;

public class OrderDto {
    private Long orderId;
    private Long cartId;
    private Long userId;
    private String paymentType;
    private String deliveryType;
    private DateTime orderDate;
    private DateTime deliveryDate;
    private String deliveryAddress;
    private OrderStatus orderStatus;

    public OrderDto(Long orderId, Long cartId, Long userId, String paymentType,
                    String deliveryType, DateTime orderDate, DateTime deliveryDate,
                    String deliveryAddress, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.cartId = cartId;
        this.userId = userId;
        this.paymentType = paymentType;
        this.deliveryType = deliveryType;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.deliveryAddress = deliveryAddress;
        this.orderStatus = orderStatus;
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

    public String getPaymentType() {
        return paymentType;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public DateTime getOrderDate() {
        return orderDate;
    }

    public DateTime getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
