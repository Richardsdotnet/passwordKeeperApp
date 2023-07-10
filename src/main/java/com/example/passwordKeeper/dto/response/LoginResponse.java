package com.example.passwordKeeper.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginResponse {
    private String message;
    private boolean isLoggedIn;
}
