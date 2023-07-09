package com.example.passwordKeeper.repositories;

import com.example.passwordKeeper.models.ManagePasswords;
import org.hibernate.dialect.MySQLStorageEngine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRepository extends JpaRepository<ManagePasswords, Long> {

}
