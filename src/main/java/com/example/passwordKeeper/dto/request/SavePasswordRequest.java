package com.example.passwordKeeper.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SavePasswordRequest {
    private String pin;
    private String accountName;
    private String password;


}
