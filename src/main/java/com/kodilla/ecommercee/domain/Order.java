package com.kodilla.ecommercee.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order {

    private Long orderId;
    private Long cardId;
    private User user;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private DeliveryType deliveryType;
    private OrderStatus orderStatus;

    public Order(LocalDate orderDate, LocalDate deliveryDate, DeliveryType deliveryType, OrderStatus orderStatus) {
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.deliveryType = deliveryType;
        this.orderStatus = orderStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getOrderId() {
        return orderId;
    }

    @Column(name = "CARD_ID")
    public Long getCardId() {
        return cardId;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    public User getUser() {
        return user;
    }

    @Column(name = "ORDER_DATE")
    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Column(name = "DELIVERY_DATE")
    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    @Column(name = "DELIVERY_TYPE")
    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    @Column(name = "ORDER_STATUS")
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }




}
