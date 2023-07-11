package com.example.passwordKeeper.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class RegistrationException extends Throwable {
    public RegistrationException(String message){
        super(message);
    }
}
