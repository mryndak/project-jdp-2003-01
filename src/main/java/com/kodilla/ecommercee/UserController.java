package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.OrderStatus;
import com.kodilla.ecommercee.domain.PaymentType;
import com.kodilla.ecommercee.domain.UserDto;
import com.kodilla.ecommercee.mapper.UserMapper;
import com.kodilla.ecommercee.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("v1/ecommercee/user")
public class UserController {

    @Autowired
    private DbService service;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getUsers")
    public List<UserDto> getUsers() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getUser")
    public UserDto getUser(Long userId) {
        return new UserDto(1L, "test_fname", "test_lname", "test_login",
                "test_password", "test@email", PaymentType.CASH_BY_DELIVERY, OrderStatus.NEW);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteUser")
    public void deleteUser(Long userId) {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateUser")
    public UserDto updateUser(Long userId) {
        return new UserDto(1L, "edited test_fnam", "edited test_lnam",
                "edited test_login", "edited test_password", "edited test@email",
                PaymentType.ADVANCE_PAYMENT, OrderStatus.VERIFIED);
    }

    @RequestMapping(method = RequestMethod.POST, value = "createUser", consumes = APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody UserDto userDto) {

    }
}
