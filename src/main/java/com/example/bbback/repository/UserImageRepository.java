package com.example.bbback.repository;

import com.example.bbback.model.UserImages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserImageRepository extends JpaRepository<UserImages,Long> {
}
