package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.Address;
import com.kodilla.ecommercee.domain.Cart;
import com.kodilla.ecommercee.domain.OrderDto;
import com.kodilla.ecommercee.domain.User;
import com.kodilla.ecommercee.mapper.OrderMapper;
import com.kodilla.ecommercee.service.AddressService;
import com.kodilla.ecommercee.service.CartService;
import com.kodilla.ecommercee.service.OrderService;
import com.kodilla.ecommercee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/ecommercee/orders/")
public class OrderController {
    private final OrderMapper orderMapper;
    private final OrderService service;
    private final UserService userService;
    private final AddressService addressService;
    private final CartService cartService;

    @Autowired
    public OrderController(OrderService service, OrderMapper orderMapper, UserService userService,
                           AddressService addressService, CartService cartService) {
        this.service = service;
        this.orderMapper = orderMapper;
        this.userService = userService;
        this.cartService = cartService;
        this.addressService = addressService;
    }
    @RequestMapping(method = RequestMethod.GET, value = "getOrders")
    public List<OrderDto> getOrders() {
        return orderMapper.mapToOrderDtoList(service.getAllOrders());
    }
    @RequestMapping(method = RequestMethod.GET, value = "getOrder")
    public OrderDto getOrder(@RequestParam Long orderId) {
        return orderMapper.mapToOrderDto(service.getOrderById(orderId));
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "deleteOrder")
    public void deleteOrder(@RequestParam Long orderId) {
        service.deleteOrder(orderId);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "updateOrder")
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        User user = userService.getUserById(orderDto.getUserId());
        Address address = addressService.getAddressById(orderDto.getAddressId());
        Cart cart = cartService.getCartById(orderDto.getCartId());
        return orderMapper.mapToOrderDto(service.saveOrder(orderMapper.mapToOrder(orderDto, cart, address, user)));
    }
    @RequestMapping(method = RequestMethod.POST, value = "createOrder")
    public void createOrder(@RequestBody OrderDto orderDto) {
        User user = userService.getUserById(orderDto.getUserId());
        Address address = addressService.getAddressById(orderDto.getAddressId());
        Cart cart = cartService.getCartById(orderDto.getCartId());
        service.saveOrder(orderMapper.mapToOrder(orderDto, cart, address, user));
    }
}