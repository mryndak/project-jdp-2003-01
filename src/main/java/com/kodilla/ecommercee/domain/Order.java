package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "ORDERS")
public final class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "CART_ID")
    private Cart cartId;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User userId;

    @OneToOne
    @JoinColumn(name = "ADDRESS_ID")
    private Address addressId;

    @Column(name = "ORDER_DATE")
    @NotNull
    private LocalDate orderDate;

    @Column(name = "DELIVERY_DATE")
    @NotNull
    private LocalDate deliveryDate;

    @Column(name = "DELIVERY_TYPE")
    @NotNull
    @Enumerated(EnumType.STRING)
    private DeliveryType deliveryType;

    @Column(name = "PAYMENT_TYPE")
    @NotNull
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Column(name = "ORDER_STATUS")
    @NotNull
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.ORDER_PLACED;

}
