package com.example.passwordKeeper.repositories;

import com.example.passwordKeeper.models.Passwords;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRepository extends JpaRepository<Passwords, Long> {

}


//if (user != null) {
//        Password password = new Password();
//        password.setTitle("Example");
//        password.setUsername("exampleuser");
//        password.setPasswordValue("examplepassword");
//        password.setUrl("https://example.com");
//        password.setNotes("Additional notes");
//
//        password.setUser(user);
//
//        user.getPasswords().add(password);
//
//        userRepository.save(user);
       // }