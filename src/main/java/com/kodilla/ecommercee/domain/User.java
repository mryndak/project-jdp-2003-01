package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.GenericEntity;

public class User extends GenericEntity {

    private Long userId;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String email;
    private Payment paymentType;
    private OrderStatus orderStatus;
}
