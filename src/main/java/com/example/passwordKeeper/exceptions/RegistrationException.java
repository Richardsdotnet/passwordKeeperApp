package com.example.passwordKeeper.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class RegistrationException extends Throwable {
    private String message;
}
