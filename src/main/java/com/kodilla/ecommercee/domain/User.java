package com.kodilla.ecommercee.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USER")
public class User {

    private Long userId;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String email;
    private PaymentType paymentType;
    private OrderStatus orderStatus;
    private List<Order> ordersList = new ArrayList<>();
    private List<Address> addressList = new ArrayList<>();

    public User(Long userId, String firstName, String lastName,
                String login, String password, String email,
                PaymentType paymentType, OrderStatus orderStatus) {

        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.paymentType = paymentType;
        this.orderStatus = orderStatus;
    }

    public void addOrder(Order order) {
        ordersList.add(order);
    }

    public void addAddress(Address address) {
        addressList.add(address);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "USER_ID")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }


    @Column(name = "LOGIN")
    public String getLogin() {
        return login;
    }


    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }


    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }


    @Column(name = "PAYMENT_TYPE")
    public PaymentType getPaymentType() {
        return paymentType;
    }


    @Column(name = "ORDER_STATUS")
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }


    @OneToMany(
            targetEntity = Order.class,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Order> getOrdersList() {
        return ordersList;
    }


    @OneToMany(
            targetEntity = Address.class,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Address> getAddressList() {
        return addressList;
    }

}
