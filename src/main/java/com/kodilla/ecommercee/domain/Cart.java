package com.kodilla.ecommercee.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CART")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;

    @Column(name = "CART_DATE")
    private LocalDate cartDate;

    @OneToMany(
            targetEntity = CartItem.class,
            mappedBy = "id",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY

    )
    private List<CartItem> cartItemList = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Order order;


}
