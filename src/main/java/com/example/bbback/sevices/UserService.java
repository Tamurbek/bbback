package com.example.bbback.sevices;

import com.example.bbback.dto.ApiResponse;
import com.example.bbback.dto.UserDto;

import java.io.IOException;

public interface UserService {
    ApiResponse createUser(UserDto userDto) throws IOException;
    ApiResponse updateUser(long id,UserDto userDto) throws IOException;
    ApiResponse deleteUser(long id);
    ApiResponse getUser(long id);
    ApiResponse allUser();
}
