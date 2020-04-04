package com.kodilla.ecommercee.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Order")
@Data
public final class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "id")
    private Long id;

    @Column(name = "cartId")
    @NotNull
    @OneToOne(
            targetEntity = Cart.class,
            cascade = CascadeType.REMOVE,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "cardId")
    private Long cartId;

    @Column(name = "userId")
    @NotNull
    @ManyToOne(
            targetEntity = User.class,
            cascade = CascadeType.REMOVE,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "user.id")
    private Long userId;

    @Column(name = "addressId")
    @NotNull
    @OneToOne(
            targetEntity = Address.class,
            cascade = CascadeType.REMOVE,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "addressId")
    private Long addressId;

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
