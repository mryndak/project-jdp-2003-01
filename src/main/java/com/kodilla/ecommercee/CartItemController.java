package com.kodilla.ecommercee;


import com.kodilla.ecommercee.domain.CartItemDto;
import com.kodilla.ecommercee.mapper.CartItemMapper;
import com.kodilla.ecommercee.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/ecommercee/cartItem")
public class CartItemController {
    @Autowired
    private CartItemRepository cartItemRepository;

    @RequestMapping(method = RequestMethod.GET, value = "getCartItems")
    public List<CartItemDto> getCartItems() {
        return new ArrayList<>();
    }

//    @RequestMapping(method = RequestMethod.GET, value = "getCartItem")
//    public CartItemDto getCartItem(@RequestParam Long id) {
//        return new CartItemDto(1L, 1L,1L, "TV", LocalDate.now(),
//                10L, LocalDate.now());
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "deleteCartItem")
//    public void deleteCartItem(@RequestParam Long id) {
//        System.out.println("CartItem has been deleted");
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, value = "updateCartItem")
//    public CartItemDto updateCartItem(@RequestBody CartItemDto cartItemDto) {
//        return new CartItemDto(2L, 2L, 1L,"TV - UPDATE", LocalDate.now(),
//                10L, LocalDate.now());
//
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "createCartItem")
//    public void createCartItem(@RequestBody CartItemDto cartItemDto) {
//        System.out.println("CartItem was created");
//    }

}
