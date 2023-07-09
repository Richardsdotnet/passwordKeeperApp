package com.example.passwordKeeper.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegistrationRequest {
    private String name;
    private String phoneNumber;
    private String id;
    private String email;
    private String accessCode;
}
