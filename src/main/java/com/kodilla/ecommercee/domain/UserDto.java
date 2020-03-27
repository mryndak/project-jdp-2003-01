package com.kodilla.ecommercee.domain;

public class UserDto {

    private Long id;
    private String userName;

    public UserDto(Long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }
}
