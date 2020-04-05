package com.kodilla.ecommercee;

public class OrderController {
    @RequestMapping(method = RequestMethod.GET, value = "getOrders")
    public List<OrderDto> getOrders() {
        return new ArrayList<>();
    }
    @RequestMapping(method = RequestMethod.GET, value = "getOrder")
    public OrderDto getOrder(Long orderId) {
        return new OrderDto(1L, 1L, 1L, LocalDate.now().plusDays(10), DeliveryType.TO_HOME, PaymentType.PAYU, OrderStatus.ORDER_PLACED);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "deleteOrder")
    public void deleteOrder(Long orderId) {
        System.out.println("DeleteOrder @@@####@@@###");
    }
    @RequestMapping(method = RequestMethod.PUT, value = "updateOrder")
    public OrderDto updateOrder(Long orderId) {
        return new OrderDto(1L, 1L, 1L, LocalDate.now().plusDays(20), DeliveryType.TO_HOME, PaymentType.PAYU, OrderStatus.PREPARING_ORDER);
    }
    @RequestMapping(method = RequestMethod.POST, value = "createOrder")
    public void createOrder(OrderDto orderDto) {
        System.out.println("CreateOrder #@@@@@@@@@@@###!@%%%%%%%");
    }
}
