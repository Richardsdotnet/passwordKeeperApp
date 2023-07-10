package com.example.passwordKeeper.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor

public class User {
    private String name;
    private String phoneNumber;
    private String id;
    private String email;
    private String accessCode;
}
