package com.kodilla.ecommercee.service;

import com.kodilla.ecommercee.domain.*;
import com.kodilla.ecommercee.mapper.CartItemMapper;
import com.kodilla.ecommercee.repository.CartItemRepository;
import com.kodilla.ecommercee.repository.CartRepository;
import com.kodilla.ecommercee.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

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

    public CartItemDto getCartItem(final Long id) throws CartNotFoundException {
        Optional<CartItem> cartItem = cartItemRepository.findById(id);
        return cartItemMapper.mapToCartItemDto(cartItem.orElseThrow(CartNotFoundException::new));
    }

    public CartItemDto create(CartItemDto cartItemDto) throws CartNotFoundException {
        Cart cart = cartRepository.findById(cartItemDto.getCartId()).orElseThrow(
                CartNotFoundException::new);
        CartItem cartItem = cartItemMapper.mapToCartItem(cartItemDto, cart);
        return cartItemMapper.mapToCartItemDto(cartItemRepository.save(cartItem));
    }
}
