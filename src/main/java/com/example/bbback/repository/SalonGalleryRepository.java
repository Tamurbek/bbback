package com.example.bbback.repository;

import com.example.bbback.model.SalonGallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SalonGalleryRepository extends JpaRepository<SalonGallery,Long> {
    List<SalonGallery> findAllBySalonId(Long salonId);
    void deleteBySalonId(Long salonId);
}
