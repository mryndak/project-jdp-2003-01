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
@Table(name = "orders")
public final class Order {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "cartId")
    private Cart cartId;

    @ManyToOne
    @JoinColumn
    private User userId;

    @OneToOne
    @JoinColumn
    private Address addressId;

    @Column(name = "orderDate")
    @NotNull
    private LocalDate orderDate;

    @Column(name = "deliveryDate")
    @NotNull
    private LocalDate deliveryDate;

    @Column(name = "deliveryType")
    @NotNull
    @Enumerated(EnumType.STRING)
    private DeliveryType deliveryType;

    @Column(name = "paymentType")
    @NotNull
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Column(name = "orderStatus")
    @NotNull
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.ORDER_PLACED;
}
