package com.example.bbback.sevices.ServiceImp;

import com.example.bbback.model.MasterImages;
import com.example.bbback.model.UserImages;
import com.example.bbback.repository.FileDataRepository;
import com.example.bbback.repository.MasterImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;
import java.util.UUID;

@Service
public class StorageService {

    @Autowired
    private FileDataRepository fileDataRepository;

    @Autowired
    private MasterImagesRepository masterImagesRepository;

    private final String FOLDER_PATH= System.getProperty("user.dir") + "\\uploadFiles\\UsersImages\\";
    private final String FOLDER_PATH_Master= System.getProperty("user.dir") + "\\uploadFiles\\MasterImages\\";

    public String generateImageName(){
        String uuid= String.valueOf(UUID.randomUUID());
        boolean b = fileDataRepository.existsByOriginalNameNot(String.valueOf(uuid));
        return b?uuid:generateImageName();
    }

//    public UserImages uploadImageToFileSystem(MultipartFile file) throws IOException {
//        String filePath=FOLDER_PATH+file.getOriginalFilename();
//        UserImages fileData=fileDataRepository.save(UserImages.builder()
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
//    public MasterImages uploadMaterImageToFileSystem(MultipartFile file) throws IOException {
////        String name=generateImageName();
//        String filePath=FOLDER_PATH_Master+file.getOriginalFilename();
//
//        MasterImages fileData=masterImagesRepository.save(MasterImages.builder()
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

//    public byte[] downloadImageFromFileSystem(String fileName) throws IOException {
//        Optional<UserImages> fileData = fileDataRepository.findByOriginalName(fileName);
//        String filePath=fileData.get().getPath();
//        byte[] images = Files.readAllBytes(new File(filePath).toPath());
//        return images;
//    }
}
