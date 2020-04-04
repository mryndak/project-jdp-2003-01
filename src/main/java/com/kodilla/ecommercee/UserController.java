package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.OrderStatus;
import com.kodilla.ecommercee.domain.Payment;
import com.kodilla.ecommercee.domain.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
;

@RestController
@RequestMapping("v1/ecommercee/user")
public class UserController {
    @RequestMapping(method = RequestMethod.GET, value = "getUsers")
    public List<UserDto> getUsers() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getUser")
    public UserDto getUser(Long userId) {
        return new UserDto(1L, "test_fname", "test_lname","test_login",
                "test_password", "test@email", Payment.CASH_BY_DELIVERY, OrderStatus.ORDER_PLACED);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteUser")
    public void deleteUser(Long userId) {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateUser")
    public UserDto updateUser(Long userId) {
        return new UserDto(1L, "edited test_fnam", "edited test_lnam",
                "edited test_login", "edited test_password", "edited test@email",
                Payment.ADVANCE_PAYMENT, OrderStatus.ORDER_CONFIRMED);
    }

    @RequestMapping(method = RequestMethod.POST, value = "createUser")
    public void createUser(UserDto userDto) {

    }
}
