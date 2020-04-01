package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.CartDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/v1/ecommercee/cart")
public class CartController {


    @RequestMapping(method = RequestMethod.GET, value = "getCart")
    public CartDto getCart(Long cartId) {
        return new CartDto(1L, LocalDate.now());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteCart")
    public boolean deleteCart(Long cartId) {
        System.out.println("Cart has been deleted");
        return true;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateCart")
    public CartDto updateProduct(CartDto cartDto) {
        return new CartDto(1L, LocalDate.of(2020, 10, 10));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createCart")
    public boolean createCart(CartDto cartDto) {
        System.out.println("Cart was created");
        return true;
    }
}
