package com.example.bbback.sevices;

import com.example.bbback.dto.ApiResponse;
import com.example.bbback.dto.FadeBackDto;

public interface FadeBackService {
    ApiResponse createFabeBack(FadeBackDto dto);
    ApiResponse updateFadeBack(Long id,FadeBackDto dto);
    ApiResponse getAllFadeBack(Long salonId);
    ApiResponse deleteFadeBack(Long id);
}
