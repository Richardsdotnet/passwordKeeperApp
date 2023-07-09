package com.example.passwordKeeper.repositories;

import com.example.passwordKeeper.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
