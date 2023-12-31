package com.example.bbback.repository;

import com.example.bbback.model.FadeBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FadeBackRepository extends JpaRepository<FadeBack,Long> {
    List<FadeBack> findAllBySalonId(Long salonId);
    @Transactional
    void deleteBySalonId(Long salonId);
}
