package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.GenericEntity;
import org.joda.time.DateTime;

public class Order extends GenericEntity {
    private Long orderId;
    private Long cartId;
    private Long userId;
    private String paymentType;
    private String deliveryType;
    private DateTime orderDate;
    private DateTime deliveryDate;
    private String deliveryAddress;
    private OrderStatus orderStatus;
}
