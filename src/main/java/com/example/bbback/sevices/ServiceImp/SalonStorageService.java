package com.example.bbback.sevices.ServiceImp;

import com.example.bbback.model.SalonGallery;
import com.example.bbback.model.SalonImage;
import com.example.bbback.model.UserImages;
import com.example.bbback.repository.FileDataRepository;
import com.example.bbback.repository.SalonFileDataRepository;
import com.example.bbback.repository.SalonImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;
import java.util.UUID;

@Service
public class SalonStorageService {

    @Autowired
    private SalonFileDataRepository salonFileDataRepository;

    @Autowired
    private SalonImageRepository salonImageRepository;

    public String generateImageName(){
        String uuid= String.valueOf(UUID.randomUUID());
        boolean b = salonImageRepository.existsByOriginalNameNot(String.valueOf(uuid));
        return b?uuid:generateImageName();
    }

    private final String FOLDER_PATH= System.getProperty("user.dir") + "\\uploadFiles\\salonGallery\\";
    private final String FOLDER_PATH_image= System.getProperty("user.dir") + "\\uploadFiles\\salonImage\\";

//    public SalonGallery uploadImageToFileSystem(Long salonId,MultipartFile file) throws IOException {
//        String filePath=FOLDER_PATH+file.getOriginalFilename();
//
//        SalonGallery fileData=salonFileDataRepository.save(SalonGallery.builder()
//                .salonId(salonId)
//                .originalName(file.getOriginalFilename())
//                .contentType(file.getContentType())
//                .path(filePath).build());
//
//        file.transferTo(new File(filePath));
//
//        if (fileData != null) {
//            return fileData;
//        }
//        return null;
//    }

//    public SalonImage uploadSalonImageToFileSystem(MultipartFile file) throws IOException {
//        String filePath=FOLDER_PATH_image+file.getName()+"."+file.getContentType().split("/")[1];
////        System.out.println(file.getName()+"."+file.getContentType());
//
//        SalonImage fileData=salonImageRepository.save(SalonImage.builder()
//                .originalName(file.getOriginalFilename())
//                .contentType(file.getContentType())
//                .path(filePath).build());
//
//        file.transferTo(new File(filePath));
//
//        if (fileData != null) {
//            return fileData;
//        }
//        return null;
//    }
}
