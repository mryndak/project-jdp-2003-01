package com.kodilla.ecommercee.mapper;


import com.kodilla.ecommercee.domain.Cart;
import com.kodilla.ecommercee.domain.CartItem;
import com.kodilla.ecommercee.domain.CartItemDto;
import com.kodilla.ecommercee.domain.Product;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(uses = {Product.class, Cart.class})
public interface CartItemMapper {
    @Mapping(source="cartId", target="cart.id")
    CartItem cartItemDtoToCartItem(CartItemDto cartItemDto);

}
