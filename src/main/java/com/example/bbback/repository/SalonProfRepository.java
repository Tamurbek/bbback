package com.example.bbback.repository;

import com.example.bbback.model.SalonsProf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalonProfRepository extends JpaRepository<SalonsProf,Long> {
    boolean existsByBrandName(String brandName);
    boolean deleteAllByUsersId(long usersId);
    List<SalonsProf> findByUsersIdAndId(long usersId, Long id);
    List<SalonsProf> findByUsersId(Long id);

    boolean existsByIdNotAndBrandName(Long id, String brandName);

}
