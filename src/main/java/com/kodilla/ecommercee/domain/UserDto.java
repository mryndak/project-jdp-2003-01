package com.kodilla.ecommercee.domain;

public class UserDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String email;
    private Payment paymentType;
    private OrderStatus orderStatus;

    public UserDto(Long userId, String firstName, String lastName,
                   String login, String password, String email,
                   Payment paymentType, OrderStatus orderStatus) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.paymentType = paymentType;
        this.orderStatus = orderStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Payment getPaymentType() {
        return paymentType;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
