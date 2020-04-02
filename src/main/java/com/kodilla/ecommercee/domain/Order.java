package com.kodilla.ecommercee.domain;

import java.time.LocalDate;

public class Order extends GenericEntity {
    private Long orderId;
    private Long cartId;
    private Long userId;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private DeliveryType deliveryType;
    private PaymentType paymentType;
    private OrderStatus orderStatus;

}
