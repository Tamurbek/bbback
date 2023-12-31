package com.example.bbback.repository;

import com.example.bbback.model.Master;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MasterRepository extends JpaRepository<Master,Long> {
    List<Master> findBySalonId(Long salonId);
    boolean existsBySalonIdAndName(Long salonId, String name);
    boolean deleteBySalonId(Long salonId);
    boolean existsByIdNotAndName(Long id, String name);
}
