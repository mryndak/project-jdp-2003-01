package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.kodilla.ecommercee.domain.OrderStatus.NEW;
import static com.kodilla.ecommercee.domain.PaymentType.BANK_TRANSFER;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EcommerceeApplicationTests {

    @Test
       public void contextLoads() {
        }
 /*           //Given
            List<Order> ordersList = new ArrayList<>();
    User user = new User(
            1L,
            "Test_firstname",
            "Test_lastname",
            "Test_login",
            "Test_password",
            "test@email",
            PaymentType.valueOf("CASH_BY_DELIVERY"),
            OrderStatus.valueOf("NEW"),

            );

    Order order = new Order(
            1L,
            1L,
            1L,
            LocalDate.of(2020, 4, 1),
            LocalDate.of(2020, 4, 10),
            DeliveryType.valueOf("COURIER"),
            OrderStatus.valueOf("NEW"),
            user;
    )

    //When

    //Then

    //CleanUp*/

}

