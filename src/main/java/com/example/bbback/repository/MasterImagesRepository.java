package com.example.bbback.repository;

import com.example.bbback.model.MasterImages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterImagesRepository extends JpaRepository<MasterImages,Long> {
    boolean existsByOriginalNameNot(String originalName);
}
