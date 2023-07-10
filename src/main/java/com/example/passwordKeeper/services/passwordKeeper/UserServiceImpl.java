package com.example.passwordKeeper.services.passwordKeeper;

import com.example.passwordKeeper.dto.request.RegistrationRequest;
import com.example.passwordKeeper.dto.response.RegistrationResponse;
import com.example.passwordKeeper.models.User;
import com.example.passwordKeeper.repositories.UserRepository;
import com.example.passwordKeeper.services.UserServices;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor

@Service
@Slf4j
public class UserServiceImpl implements UserServices {
    @NonNull

    private UserRepository userRepository;
    ModelMapper modelMapper = new ModelMapper();
    @Override
    public RegistrationResponse register(RegistrationRequest registrationRequest) {
        RegistrationResponse registrationResponse = new RegistrationResponse();
        User user = new User();
        modelMapper.map(user,registrationRequest);
        userRepository.save(user);
        registrationResponse.setMessage("Registration successful");
        return registrationResponse;

    }

    @Override
    public Long countAllUsers() {
        return userRepository.count();
    }
}
