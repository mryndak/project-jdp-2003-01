package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.CartDto;
import com.kodilla.ecommercee.domain.CartItemDto;
import com.kodilla.ecommercee.domain.ProductDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/v1/ecommercee/cartItem")
public class CartItemController {


    @RequestMapping(method = RequestMethod.GET, value = "getCartItems")
    public List<CartItemDto> getCartItemsDto() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getCartItem")
    public CartItemDto getCartItem(Long id) {
        return new CartItemDto(1L, 1L, "CartItem product test",
                LocalDate.of(2020,5,5), 200L, LocalDate.now());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteCartItem")
    public boolean deleteCartItem(Long id) {
        System.out.println("CartItem has been deleted");
        return true;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateCartItem")
    public CartItemDto updateCartItem(CartItemDto cartItemDto) {
        return new CartItemDto(2L, 2L, "CartItem update product test",
                LocalDate.of(2015,3,3), 200L, LocalDate.now());
    }

    @RequestMapping(method = RequestMethod.POST, value = "createCartItem")
    public boolean createCartItem(CartItemDto cartItemDto) {
        System.out.println("CartItem was created");
        return true;
    }
}
