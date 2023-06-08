package com.demo.service;

import com.demo.model.UserInfo;
import com.demo.utils.ApiResponseModel;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface UserInfoService {

    ResponseEntity<ApiResponseModel> createUser(UserInfo userInfo);

    ResponseEntity<ApiResponseModel> findUserById(long userId);
    ResponseEntity<ApiResponseModel> deleteUserByID(long userId);
    ResponseEntity<ApiResponseModel> updateUser(UserInfo userId);
}
