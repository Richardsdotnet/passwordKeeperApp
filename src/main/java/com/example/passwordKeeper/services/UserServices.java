package com.example.passwordKeeper.services;

import com.example.passwordKeeper.dto.request.LoginRequest;
import com.example.passwordKeeper.dto.request.RegistrationRequest;
import com.example.passwordKeeper.dto.response.LoginResponse;
import com.example.passwordKeeper.dto.response.RegistrationResponse;
import com.example.passwordKeeper.exceptions.LoginException;
import com.example.passwordKeeper.exceptions.RegistrationException;
import com.example.passwordKeeper.models.Passwords;
import org.springframework.stereotype.Service;

@Service

public interface UserServices {

    RegistrationResponse register(RegistrationRequest registrationRequest) throws RegistrationException;

    Long countAllUsers();

    LoginResponse login(LoginRequest loginRequest) throws LoginException;

   // SavePasswordResponse savePassword(SavePasswordRequest savePasswordRequest);

    void savePassword(Passwords password);


//    RegistrationResponse register(RegistrationRequest registrationRequest);
//    LoginResponse login(LoginRequest loginRequest);
//    SavePasswordResponse savePassword(SavePasswordRequest savePasswordRequest);
//    UpdatePasswordResponse updatePassword(UpdatePasswordRequest updatePasswordRequest);
//    DeletePasswordResponse deletePassword(DeletePasswordRequest deletePasswordRequest);
//    void findPasswordById();
//    void findPasswordByAccountName();

}
