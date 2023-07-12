package com.example.passwordKeeper.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String accessCode;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "passwordUser", orphanRemoval = true)
    private List<Passwords> listOfPassword = new ArrayList<>();
}
