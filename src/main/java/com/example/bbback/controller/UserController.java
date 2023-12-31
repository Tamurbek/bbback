package com.example.bbback.controller;

import com.example.bbback.dto.ApiResponse;
import com.example.bbback.dto.UserDto;
import com.example.bbback.sevices.ServiceImp.UserServiceImp;
import com.example.bbback.sevices.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

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







