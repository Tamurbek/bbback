package com.example.bbback.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class SalonImagesDto {
    private Long salonId;
    private MultipartFile[] images;
}
