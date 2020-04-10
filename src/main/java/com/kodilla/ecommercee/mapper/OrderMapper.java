package com.kodilla.ecommercee.mapper;

import com.kodilla.ecommercee.domain.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {User.class, Address.class, Cart.class})
public interface OrderMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "cartId", target = "Cart.id")
    @Mapping(source = "userId", target = "User.id")
    @Mapping(source = "addressId", target = "Address.id")
    @Mapping(source = "orderDate", target = "orderDate")
    @Mapping(source = "deliveryDate", target = "deliveryDate")
    @Mapping(source = "deliveryType", target = "deliveryType")
    @Mapping(source = "paymentType", target = "paymentType")
    @Mapping(source = "orderStatus", target = "orderStatus")
    Order mapToOrder(final OrderDto orderDto);
}
