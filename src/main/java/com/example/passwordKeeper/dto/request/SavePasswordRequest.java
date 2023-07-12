package com.example.passwordKeeper.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class SavePasswordRequest {
    private long id;
    private String accountName;
    private LocalDateTime timeCreated;
    private LocalDateTime lastEdited;
    private String title;
    private String username;
    private String passwordValue;


}
