package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.CartDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/v1/ecommercee/cart")
public class CartController {

    @RequestMapping(method = RequestMethod.GET, value = "getCart")
    public CartDto getCart(@RequestParam Long id) {
        return new CartDto(1L, LocalDate.now());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteCart")
    public void deleteCart(@RequestParam Long id) {
        System.out.println("Cart has been deleted");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateCart")
    public CartDto updateCart(@RequestBody CartDto cartDto) {
        return new CartDto(2L, LocalDate.now());
    }

    @RequestMapping(method = RequestMethod.POST, value = "createCart")
    public void createCart(@RequestBody CartDto cartDto) {
        System.out.println("CartItem was created");
    }
}
