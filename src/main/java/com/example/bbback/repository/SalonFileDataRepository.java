package com.example.bbback.repository;

import com.example.bbback.model.SalonGallery;
import com.example.bbback.model.UserImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SalonFileDataRepository extends JpaRepository<SalonGallery,Long> {

}
