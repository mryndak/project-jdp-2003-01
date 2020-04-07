package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/ecommercee/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "getUsers")
    public List<UserDto> getUsers() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getUser")
    public UserDto getUser(@RequestParam Long userId) {
        return new UserDto(1L, 1L, 1L, "sth",
                "sth", "login", "pwd", "mail");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteUser")
    public void deleteUser(@RequestParam Long userId) {
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateUser")
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return new UserDto(1L, 1L, 1L, "STH",
                "sth", "login", "pwd", "MAIL");
    }

    @RequestMapping(method = RequestMethod.POST, value = "createUser")
    public void createUser(@RequestBody UserDto userDto) {
    }
}
