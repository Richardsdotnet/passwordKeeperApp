package com.example.passwordKeeper.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class ManagePasswords {
    private String accountName;
    private String password;
    private String id;
    private LocalDateTime timeCreated;
    private LocalDateTime lastEdited;

}
