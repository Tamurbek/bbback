package com.example.bbback.sevices;

import com.example.bbback.dto.ApiResponse;
import com.example.bbback.dto.MasterDto;

import java.io.IOException;

public interface MasterService {
    ApiResponse addMaster(MasterDto dto) throws IOException;
    ApiResponse updateMaster(Long id,MasterDto dto) throws IOException;
    ApiResponse getAllMaster(Long salonId);
    ApiResponse getIdMaster(Long id);
    ApiResponse deleteMaster(Long id);
}
