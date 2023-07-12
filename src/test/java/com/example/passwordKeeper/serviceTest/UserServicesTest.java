package com.example.passwordKeeper.serviceTest;

import com.example.passwordKeeper.dto.request.LoginRequest;
import com.example.passwordKeeper.dto.request.RegistrationRequest;
import com.example.passwordKeeper.dto.request.SavePasswordRequest;
import com.example.passwordKeeper.dto.response.LoginResponse;
import com.example.passwordKeeper.dto.response.RegistrationResponse;
import com.example.passwordKeeper.dto.response.SavePasswordResponse;
import com.example.passwordKeeper.exceptions.LoginException;
import com.example.passwordKeeper.exceptions.RegistrationException;
import com.example.passwordKeeper.models.User;
import com.example.passwordKeeper.services.UserServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest



class UserServicesTest {

    @Autowired
    private  UserServices userServices;


    private RegistrationRequest registrationRequest;
    private RegistrationRequest registrationRequest1;
    private RegistrationResponse registrationResponse;
    private RegistrationResponse registrationResponse1;
    private SavePasswordRequest savePasswordRequest;
    private SavePasswordResponse savePasswordResponse;

    private LoginRequest loginRequest;
    private LoginRequest loginRequest1;
    private LoginResponse loginResponse;
    private LoginResponse loginResponse1;


    @BeforeEach
     void beforeEach() {
        registrationRequest = new RegistrationRequest();
        registrationRequest = RegistrationRequest.builder()
                .accessCode("fooo")
                .email("richie22@gmail.com")
                .name("Mike Doehh")
                .phoneNumber("08081493711")
                .build();
        registrationRequest1 = new RegistrationRequest();

        registrationResponse = new RegistrationResponse();
        registrationResponse1 = new RegistrationResponse();


        loginRequest = new LoginRequest();
        loginRequest1 = new LoginRequest();

        loginResponse = new LoginResponse();
        loginResponse1 = new LoginResponse();

        savePasswordRequest = new SavePasswordRequest();
        savePasswordResponse = new SavePasswordResponse();
    }


@Test
    void testThatUserCanRegister() throws RegistrationException {
    registrationResponse = userServices.register(registrationRequest);
    assertEquals("Registration successful", registrationResponse.getMessage());
    assertEquals(1, userServices.countAllUsers());
}

@Test
    void testThatUserCanLogin() throws LoginException {
        loginRequest  = LoginRequest.builder()
                .accessCode("asdf")
                .email("rich22@gmail.com")
                .build();
        loginResponse = userServices.login(loginRequest);
        assertEquals("Login successful", loginResponse.getMessage());
        assertTrue(true, loginResponse.getMessage());

}

@Test
    void testThatUsersCanSavePasswords() throws LoginException {
        loginRequest = LoginRequest.builder()
                .accessCode("asdf")
                .email("rich22@gmail.com")
                .build();
        loginResponse = userServices.login(loginRequest);
        assertEquals("Login successful", loginResponse.getMessage());

        savePasswordRequest = SavePasswordRequest.builder()
                .accountName("FaceBook")
                .passwordValue("myFB123")
                .build();
        savePasswordResponse = userServices.savePassword(savePasswordRequest);
        assertEquals("Password saved successfully", savePasswordResponse.getMessage());


}

@Test

    void testThatUsersCanViewSavedPasswords(){

}

@Test
    void testThatUserCanUseSavedPasswords(){

}

}