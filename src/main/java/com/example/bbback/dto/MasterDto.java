package com.example.bbback.dto;

import com.example.bbback.model.UserImages;
import com.example.bbback.template.Position;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class MasterDto {
    private Long salonId;
    private String name;
    private MultipartFile image;
}
