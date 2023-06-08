package com.demo.controller;

import com.demo.model.UserInfo;
import com.demo.service.UserInfoService;
import com.demo.utils.ApiResponseModel;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserMgmtController {
    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponseModel> userLogin(@RequestBody UserInfo userDetailsEntity) {
        return userInfoService.createUser(userDetailsEntity);
    }

    @GetMapping("/findUser/{id}")
    public ResponseEntity<ApiResponseModel> findUser(@PathVariable long id) {
        return userInfoService.findUserById(id);
    }
    @GetMapping("/deleteUser/{id}")
    public ResponseEntity<ApiResponseModel> deleteUser(@PathVariable long id) {
        return userInfoService.deleteUserByID(id);
    }
    @PutMapping("/updateUser")
    public ResponseEntity<ApiResponseModel> deleteUser(@RequestBody UserInfo userDetailsEntity) {
        return userInfoService.updateUser(userDetailsEntity);
    }
}
