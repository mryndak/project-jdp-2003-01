package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
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
