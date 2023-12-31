package com.example.bbback.dto;

import com.example.bbback.template.Position;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UserDto {
    private String name;

    private String phoneNumber;

    private String district;

    private String address;

    private MultipartFile userImage;

    private String userName;

    private String password;

    private Position position;
}
