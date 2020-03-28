package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.OrderDto;
import com.kodilla.ecommercee.domain.OrderStatus;
import org.joda.time.DateTime;
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
    public OrderDto getOrder() {
        return new OrderDto(1L, 1L,1L,"byCash", "PP",
                DateTime.now(), DateTime.now(), "Delivery Address", OrderStatus.ORDER_CONFIRMED);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "updateOrder")
    public OrderDto updateOrder(Long orderId) {
        return new OrderDto(1L, 1L,1L,"byCash", "PP",
                DateTime.now(), DateTime.now(), "Delivery Address", OrderStatus.ORDER_CANCELED);
    }
    @RequestMapping(method = RequestMethod.POST, value = "createOrder")
    public OrderDto crateOrder() {
        return new OrderDto(2L, 2L,2L,"byCash", "PP",
                DateTime.now(), DateTime.now(), "Delivery Address", OrderStatus.ORDER_SENT);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "deleteOrder")
    public boolean deleteOrder(Long orderId) {
        return true;
    }
}
