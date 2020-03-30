package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CART_ITEM")
public class CartItem {
    private Long cartItemID;
    private Long productId;
    private String productName;
    private LocalDate priceDate;
    private Long productCount;
    private LocalDate addedDate;

    @Id
    @GeneratedValue
    @NotNull
    @Column (name = "ID", unique = true)
    public Long getCartItem() {
        return cartItemID;
    }

    @NotNull
    @Column(name = "PRODUCT_ID")
    public Long getProductId() {
        return productId;
    }

    @NotNull
    @Column (name = "PRODUCT_NAME")
    public String getProductName() {
        return productName;
    }

    @NotNull
    @Column (name = "PRODUCT_PRICE")
    public LocalDate getPriceDate() {
        return priceDate;
    }

    @NotNull
    @Column (name = "PRODUCT COUNT")
    public Long getProductCount() {
        return productCount;
    }

    @NotNull
    @Column (name = "DATE_ADDED")
    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setCartItem(Long cartItem) {
        this.cartItemID = cartItem;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPriceDate(LocalDate priceDate) {
        this.priceDate = priceDate;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }
}
