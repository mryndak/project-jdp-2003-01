package com.kodilla.ecommercee.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "CART")
public class Cart {

    private Long cartId;
    private LocalDate cartDate;
    private List<CartItem> cartItemList = new ArrayList<>();
    private Order order;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    @Column(name="CART_DATE")
    public LocalDate getCartDate() {
        return cartDate;
    }

    public void setCartDate(LocalDate cartDate) {
        this.cartDate = cartDate;
    }

    @OneToMany(
            targetEntity = CartItem.class,
            mappedBy = "id",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY

    )
    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
