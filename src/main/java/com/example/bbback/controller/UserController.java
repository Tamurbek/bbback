package com.example.bbback.controller;

import com.example.bbback.dto.ApiResponse;
import com.example.bbback.dto.UserDto;
import com.example.bbback.model.UserImages;
import com.example.bbback.repository.UserImageRepository;
import com.example.bbback.sevices.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("/api/user/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserImageRepository userImageRepository;


    @GetMapping("/index")
    public String index(){
        return "<h1>Salom Temur</h1>";
    }
    @PostMapping("/register")
    public HttpEntity<?> userRegister(@Validated @ModelAttribute UserDto userDto) throws IOException {
        ApiResponse apiResponse= userService.createUser(userDto);
        return ResponseEntity.ok(apiResponse);
    }

    @PutMapping("/updateUser/{id}")
    public HttpEntity<?> updateUser(@Validated @PathVariable Long id,@Validated @ModelAttribute UserDto userDto) throws IOException {
        ApiResponse apiResponse=userService.updateUser(id,userDto);
        return ResponseEntity.ok(apiResponse);
    }

    @GetMapping("/getId/{id}")
    public HttpEntity<?> getIdUser(@PathVariable Long id){
        ApiResponse apiResponse=userService.getUser(id);
        return ResponseEntity.ok(apiResponse);
    }

    @GetMapping("/getUserImage/{id}")
    public HttpEntity<?> getUserImage(@Validated @PathVariable Long id){
        Optional<UserImages> image = userImageRepository.findById(id);
        if (image.isEmpty())return ResponseEntity.ok("Image Not Found");
        byte[] bytes = image.get().getImageByte();
        return ResponseEntity.ok().contentType(MediaType.valueOf(image.get().getContentType())).body(bytes);
    }

    @GetMapping("/allUsers")
    public HttpEntity<?> getAllUsers(){
        ApiResponse apiResponse=userService.allUser();
        return ResponseEntity.ok(apiResponse);
    }

    @DeleteMapping("/deleteUser/{id}")
    public HttpEntity<?> deleteUser(@PathVariable Long id){
        ApiResponse apiResponse=userService.deleteUser(id);
        return ResponseEntity.ok(apiResponse);
    }
}







