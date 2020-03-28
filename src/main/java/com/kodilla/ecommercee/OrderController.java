package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.DeliveryType;
import com.kodilla.ecommercee.domain.OrderDto;
import com.kodilla.ecommercee.domain.OrderStatus;
import com.kodilla.ecommercee.domain.PaymentType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/orders/")
public class OrderController {
    @RequestMapping(method = RequestMethod.GET, value = "getOrders")
    public List<OrderDto> getOrders() {
        return new ArrayList<>();
    }
    @RequestMapping(method = RequestMethod.GET, value = "getOrder")
    public OrderDto getOrder(Long orderId) {
        return new OrderDto(orderId, 1L, 1L, DeliveryType.TO_HOME, PaymentType.CREDIT_CARD, OrderStatus.ORDER_SENT);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "deleteOrder")
    public boolean deleteOrder(Long orderId) {
        return true;
    }
    @RequestMapping(method = RequestMethod.PUT, value = "updateOrder")
    public OrderDto updateOrder(Long orderId) {
        return new OrderDto(orderId, 1L, 1L, DeliveryType.TO_HOME, PaymentType.CREDIT_CARD, OrderStatus.ORDER_SENT);
    }
    @RequestMapping(method = RequestMethod.POST, value = "createOrder")
    public boolean createOrder(OrderDto orderDto) {
        return true;
    }
}
