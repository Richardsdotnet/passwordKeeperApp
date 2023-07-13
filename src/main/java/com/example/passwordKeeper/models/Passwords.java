package com.example.passwordKeeper.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
public class Passwords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String accountName;
    private LocalDateTime timeCreated;
    private LocalDateTime lastEdited;
    @ManyToOne(fetch = FetchType.LAZY)
    private User passwordUser;
    private String userEmail;
    private String passwordToSave;



}
