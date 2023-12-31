package com.example.bbback.repository;

import com.example.bbback.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
    boolean existsByUserName(String userName);
    boolean existsByIdNotAndUserName(Long id, String userName);
}
