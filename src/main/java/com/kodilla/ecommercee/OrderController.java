package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.DeliveryType;
import com.kodilla.ecommercee.domain.OrderDto;
import com.kodilla.ecommercee.domain.OrderStatus;
import com.kodilla.ecommercee.domain.PaymentType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/v1/ecommercee/Order")
public class OrderController {
    @RequestMapping(method = RequestMethod.GET, value = "getOrders")
    public List<OrderDto> getOrders() {
        return new ArrayList<>();
    }
    @RequestMapping(method = RequestMethod.GET, value = "getOrder")

    public OrderDto getOrder(@RequestParam Long orderId) {
        return new OrderDto(1L, 1L, 1L, 1L, LocalDate.now().plusDays(10),
                DeliveryType.TO_HOME, PaymentType.PAYU, OrderStatus.ORDER_PLACED);

    }
    @RequestMapping(method = RequestMethod.DELETE, value = "deleteOrder")
    public void deleteOrder(@RequestParam Long orderId) {
        System.out.println("DeleteOrder @@@####@@@###");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateOrder")

    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        return new OrderDto(1L, 1L, 1L, 1L, LocalDate.now().plusDays(10),
                DeliveryType.TO_HOME, PaymentType.PAYU, OrderStatus.ORDER_PLACED);
    }


    @RequestMapping(method = RequestMethod.POST, value = "createOrder")
    public void createOrder(@RequestBody OrderDto orderDto) {
        System.out.println("CreateOrder #@@@@@@@@@@@###!@%%%%%%%");
    }

}
