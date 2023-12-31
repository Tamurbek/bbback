package com.example.bbback.repository;

import com.example.bbback.model.Locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface LocationsRepository extends JpaRepository<Locations,Long> {

    @Transactional
    void deleteById(Long id);

}
