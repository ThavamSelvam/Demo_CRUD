package com.demo.serviceImpl;

import com.demo.exception.UserNotFoundException;
import com.demo.model.UserInfo;
import com.demo.repository.UserInfoRepository;
import com.demo.service.UserInfoService;
import com.demo.utils.ApiResponseModel;
import com.demo.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

@Service
public class UserInfoServiceInfoImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private CommonUtils commonUtils;

    @Override
    public ResponseEntity<ApiResponseModel> createUser(UserInfo userInfo) {
        try {
            return commonUtils.customResponse(201, "Registered successfully", userInfoRepository.save(userInfo));
        } catch (Exception e) {
            return commonUtils.badRequestResponse(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<ApiResponseModel> findUserById(long userId) {
        return commonUtils.successResponse("success", userInfoRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User Not found")));
    }

    @Override
    public ResponseEntity<ApiResponseModel> deleteUserByID(long userId) {
        if (userInfoRepository.existsById(userId)) {
            userInfoRepository.deleteById(userId);
            return commonUtils.successResponse("User deleted successfully", null);
        } else throw new UserNotFoundException("User Not found");
    }

    @Override
    public ResponseEntity<ApiResponseModel> updateUser(UserInfo userId) {
        if (userInfoRepository.existsById(userId.getId())) {
            return commonUtils.successResponse("User data updated successfully", userInfoRepository.save(userId));
        }
        else throw new UserNotFoundException("User Not found");
    }
}
