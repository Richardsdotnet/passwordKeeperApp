package com.example.passwordKeeper.serviceTest;

import com.example.passwordKeeper.dto.request.LoginRequest;
import com.example.passwordKeeper.dto.request.RegistrationRequest;
import com.example.passwordKeeper.dto.response.LoginResponse;
import com.example.passwordKeeper.dto.response.RegistrationResponse;
import com.example.passwordKeeper.repositories.UserRepository;
import com.example.passwordKeeper.services.UserServices;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest



class UserServicesTest {

    @Autowired
    private  UserServices userServices;


    private RegistrationRequest registrationRequest;
    private RegistrationRequest registrationRequest1;
    private RegistrationResponse registrationResponse;
    private RegistrationResponse registrationResponse1;

    private LoginRequest loginRequest;
    private LoginRequest loginRequest1;
    private LoginResponse loginResponse;
    private LoginResponse loginResponse1;


    @BeforeEach
     void beforeEach() {
        registrationRequest = new RegistrationRequest();
        registrationRequest = RegistrationRequest.builder()
                .accessCode("asdf")
                .email("rich@gmail.com")
                .name("John Doe")
                .phoneNumber("08081493711")
                .build();
        registrationRequest1 = new RegistrationRequest();

        registrationResponse = new RegistrationResponse();
        registrationResponse1 = new RegistrationResponse();

        loginRequest = new LoginRequest();
        loginRequest1 = new LoginRequest();

        loginResponse = new LoginResponse();
        loginResponse1 = new LoginResponse();

    }


@Test
    void testThatUserCanRegister(){
    registrationResponse = userServices.register(registrationRequest);
    assertEquals("Registration successful", registrationResponse.getMessage());
    assertEquals(1, userServices.countAllUsers());

}

}