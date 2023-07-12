package com.example.passwordKeeper.services.passwordKeeper;

import com.example.passwordKeeper.models.Passwords;
import com.example.passwordKeeper.repositories.PasswordRepository;
import com.example.passwordKeeper.services.PasswordServices;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PasswordServiceImpl implements PasswordServices {
    @NonNull
private final PasswordRepository passwordRepository;
    @Override
    public void savePassword(Passwords passwords) {
       passwordRepository.save(passwords);
    }


}
