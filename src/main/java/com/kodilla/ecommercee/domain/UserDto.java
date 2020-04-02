package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
   private String email;
    private Payment paymentType;
    private OrderStatus orderStatus;
    
}
