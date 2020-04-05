package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.CartDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;

public class CartController {

    @RequestMapping(method = RequestMethod.GET, value = "getCart")
    public CartDto getCart(Long id) {
        return new CartDto(1L, LocalDate.now());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteCart")
    public void deleteCart(Long id) {
        System.out.println("Cart has been deleted");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateCart")
    public CartDto updateCart(CartDto cartDto) {
        return new CartDto(2L, LocalDate.now());

    }

    @RequestMapping(method = RequestMethod.POST, value = "createCart")
    public void createCart(CartDto cartDto) {
        System.out.println("CartItem was created");

    }
}
