package com.example.bbback.controller;

import com.example.bbback.dto.ApiResponse;
import com.example.bbback.dto.MasterDto;
import com.example.bbback.sevices.MasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/master")
@RequiredArgsConstructor
public class MasterController {

    @Autowired
    private MasterService masterService;

    @PostMapping("/createMaster")
    public HttpEntity<?> createMaster(@Validated @ModelAttribute MasterDto masterDto) throws IOException {
        ApiResponse apiResponse=masterService.addMaster(masterDto);
        return ResponseEntity.ok(apiResponse);
    }

    @PutMapping("/updateMater/{id}")
    public HttpEntity<?> updateMaster(@Validated @PathVariable Long id,@Validated @ModelAttribute MasterDto masterDto) throws IOException {
        ApiResponse apiResponse=masterService.updateMaster(id,masterDto);
        return ResponseEntity.ok(apiResponse);
    }

    @DeleteMapping("/deleteMaster/{id}")
    public HttpEntity<?> deleteMaster(@Validated @PathVariable Long id){
        ApiResponse apiResponse=masterService.deleteMaster(id);
        return ResponseEntity.ok(apiResponse);
    }

    @GetMapping("/getAllSalonIdMasters/{salonId}")
    public HttpEntity<?> getAllSalonIdMasters(@Validated @PathVariable Long salonId){
        ApiResponse apiResponse=masterService.getAllMaster(salonId);
        return ResponseEntity.ok(apiResponse);
    }

    @GetMapping("/getIdMaster/{id}")
    public HttpEntity<?> getIdMaster(@Validated @PathVariable Long id){
        ApiResponse apiResponse=masterService.getIdMaster(id);
        return ResponseEntity.ok(apiResponse);
    }
}
