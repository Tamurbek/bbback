package com.example.bbback.repository;

import com.example.bbback.model.SalonImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface SalonImageRepository extends JpaRepository<SalonImage,Long> {
    boolean existsByOriginalNameNot(String originalName);

    @Transactional
    void deleteById(Long id);
}
