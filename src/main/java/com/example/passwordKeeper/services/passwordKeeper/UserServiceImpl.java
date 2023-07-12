package com.example.passwordKeeper.services.passwordKeeper;
import com.example.passwordKeeper.dto.request.LoginRequest;
import com.example.passwordKeeper.dto.request.RegistrationRequest;
import com.example.passwordKeeper.dto.request.SavePasswordRequest;
import com.example.passwordKeeper.dto.response.LoginResponse;
import com.example.passwordKeeper.dto.response.RegistrationResponse;
import com.example.passwordKeeper.dto.response.SavePasswordResponse;
import com.example.passwordKeeper.exceptions.RegistrationException;
import com.example.passwordKeeper.models.Passwords;
import com.example.passwordKeeper.models.User;
import com.example.passwordKeeper.repositories.PasswordRepository;
import com.example.passwordKeeper.repositories.UserRepository;
import com.example.passwordKeeper.services.PasswordServices;
import com.example.passwordKeeper.services.UserServices;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@RequiredArgsConstructor
@Service
@Slf4j

public class UserServiceImpl implements UserServices {
    @NonNull

    private final UserRepository userRepository;
    @NonNull
    private final PasswordServices passwordServices;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public RegistrationResponse register(RegistrationRequest registrationRequest) throws RegistrationException {
        RegistrationResponse registrationResponse = new RegistrationResponse();
        User user = userRepository.findByEmail(registrationRequest.getEmail());
        if (user != null) throw new RegistrationException("Can't register existing User");
        user = mapRequestToUser(registrationRequest);
        userRepository.save(user);
        registrationResponse.setMessage("Registration successful");
        return registrationResponse;
    }

    @Override
    public Long countAllUsers() {
        return userRepository.count();
    }

    public static User mapRequestToUser(RegistrationRequest registrationRequest) {
        User user = new User();
        user.setName(registrationRequest.getName());
        user.setEmail(registrationRequest.getEmail());
        user.setPhoneNumber(registrationRequest.getPhoneNumber());
        user.setAccessCode(registrationRequest.getAccessCode());

        return user;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        boolean isFoundUser = false;
        LoginResponse loginResponse = new LoginResponse();
        User foundUser = userRepository.findByEmail(loginRequest.getEmail());
        if (foundUser != null) {
            modelMapper.map(foundUser, loginRequest);
            loginResponse.setMessage("Login successful");
            loginResponse.setLoggedIn(true);
            return loginResponse;
        }
        if (!isFoundUser) {
            loginResponse.setMessage("User not found");
            loginResponse.setLoggedIn(false);
        }
        return loginResponse;
    }

    @Override
    public SavePasswordResponse savePassword(SavePasswordRequest savePasswordRequest) {
            SavePasswordResponse savePasswordResponse = new SavePasswordResponse();
            Passwords password = new Passwords();
            modelMapper.map(password,savePasswordRequest);

        System.out.println("this is password ()-->  "+password.getPasswordValue());
        System.out.println("this is password  value ()-->  "+savePasswordRequest.getPasswordValue());
            passwordServices.savePassword(password);
            savePasswordResponse.setMessage("Password saved successfully");
            return savePasswordResponse;
        }

    @Override
    public void createAndSavedPassword(Passwords password) {
        password.setPasswordUser(userRepository.findByEmail(password.getUserEmail()));
        password.setTimeCreated(LocalDateTime.now());
        passwordServices.savePassword(password);

    }


}


