package com.example.bbback.repository;

import com.example.bbback.model.UserImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileDataRepository extends JpaRepository<UserImages,Long> {
    Optional<UserImages> findByOriginalName(String originalName);

    boolean existsByOriginalNameNot(String originalName);
}
