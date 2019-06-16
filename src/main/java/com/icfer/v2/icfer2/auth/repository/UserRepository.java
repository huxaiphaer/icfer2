package com.icfer.v2.icfer2.auth.repository;

import com.icfer.v2.icfer2.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
