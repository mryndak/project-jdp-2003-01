package com.kodilla.ecommercee.mapper;

import com.kodilla.ecommercee.domain.Order;
import com.kodilla.ecommercee.domain.OrderDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderMapper {
    public Order mapToOrder(final OrderDto orderDto) {
        Order.builder()
                .cartId(orderDto.getCartId())
                .build();

        return new Order(
                null,
                orderDto.getCartId(),
                orderDto.getUserId(),
                orderDto.getOrderDate(),
                orderDto.getDeliveryDate(),
                orderDto.getDeliveryType(),
                orderDto.getPaymentType(),
                orderDto.getOrderStatus()
        );
    }
    public OrderDto mapToOrderDto(final Order order) {
        return new OrderDto(
                order.getId(),
                order.getCartId(),
                order.getUserId(),
                order.getDeliveryDate(),
                order.getDeliveryType(),
                order.getPaymentType(),
                order.getOrderStatus()
        );
    }
    public List<OrderDto> mapToOrderDtoList(final List<Order> orderList) {
        return orderList.stream()
                .map(this::mapToOrderDto)
                .collect(Collectors.toList());
    }
}
