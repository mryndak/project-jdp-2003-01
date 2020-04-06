package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserDto {

    private Long id;
    private Long orderId;
    private Long addressId;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String email;
}
