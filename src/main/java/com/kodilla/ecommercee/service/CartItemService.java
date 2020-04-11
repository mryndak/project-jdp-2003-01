package com.kodilla.ecommercee.service;

import com.kodilla.ecommercee.domain.Cart;
import com.kodilla.ecommercee.domain.CartItem;
import com.kodilla.ecommercee.domain.CartItemDto;
import com.kodilla.ecommercee.domain.Product;
import com.kodilla.ecommercee.mapper.CartItemMapper;
import com.kodilla.ecommercee.repository.CartItemRepository;
import com.kodilla.ecommercee.repository.CartRepository;
import com.kodilla.ecommercee.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CartItemService {

    @Autowired
    private CartItemMapper cartItemMapper;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartRepository cartRepository;


    public List<CartItemDto> getCartItems() {
        return cartItemMapper.mapToDtoList(cartItemRepository.findAll());
    }


    public CartItemDto create(CartItemDto cartItemDto) {
        Cart cart = cartRepository.findById(cartItemDto.getCartId()).orElseThrow(
                EntityNotFoundException::new);
        CartItem cartItem = cartItemMapper.mapToCartItem(cartItemDto, cart);
        return cartItemMapper.mapToCartItemDto(cartItemRepository.save(cartItem));
    }
}
