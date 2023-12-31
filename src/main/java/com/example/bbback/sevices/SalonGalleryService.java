package com.example.bbback.sevices;

import com.example.bbback.dto.ApiResponse;
import com.example.bbback.dto.SalonImagesDto;
import com.example.bbback.model.SalonGallery;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface SalonGalleryService {
    void AddImages(SalonImagesDto dto) throws IOException;
    ApiResponse viewImages(Long salonId);

    void deleteImages(Long salonId);
    void updateImage(Long id);

}
