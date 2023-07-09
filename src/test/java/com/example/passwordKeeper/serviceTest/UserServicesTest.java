package com.example.passwordKeeper.serviceTest;

import com.example.passwordKeeper.services.UserServices;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AllArgsConstructor

class UserServicesTest {


    @BeforeAll
    static void beforeAll() {

    }

    private final UserServices userServices;
@Test
    void testThatUserCanRegister(){
    userServices.register();
}

}