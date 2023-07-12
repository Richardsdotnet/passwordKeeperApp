package com.example.passwordKeeper.repositories;

import com.example.passwordKeeper.models.Passwords;
import com.example.passwordKeeper.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

   List<Passwords> passwords = new ArrayList<>();

}
