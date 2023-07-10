package com.example.passwordKeeper.repositories;

import com.example.passwordKeeper.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
