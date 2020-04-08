package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.User;
import com.kodilla.ecommercee.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EcommerceCartRepositoryTestSuite {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testSaveCart() {
        //Given
        User user = User.builder()
                .firstName("kamil")
                .addressId(1L)
                .build();
        userRepository.save(user);
        //When
        Long id = user.getId();
        System.out.println(id);
        //Then
        assertNotEquals((Object) 0L, id);


    }
}
