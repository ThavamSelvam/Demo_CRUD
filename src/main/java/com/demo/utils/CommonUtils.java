package com.demo.utils;

 import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CommonUtils {

    public ResponseEntity<ApiResponseModel> customResponse(int code, String message, Object data) {
        ApiResponseModel responseModel = new ApiResponseModel();
        responseModel.setData(data);
        responseModel.setMessage(message);
        responseModel.setStatusCode(code);
        return ResponseEntity.status(code).body(responseModel);
    }

    public ResponseEntity<ApiResponseModel> successResponse (String message, Object data) {
             ApiResponseModel responseModel = new ApiResponseModel();
        responseModel.setData(data);
        responseModel.setMessage(message);
        responseModel.setStatusCode(200);
        return new ResponseEntity<>(responseModel, HttpStatus.OK);
    }

    public ResponseEntity<ApiResponseModel> badRequestResponse(String message) {
        ApiResponseModel responseModel = new ApiResponseModel();
        responseModel.setData(null);
        responseModel.setMessage(message);
        responseModel.setStatusCode(400);
        return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
    }



    public ResponseEntity<ApiResponseModel> notFoundResponse(String message) {
        ApiResponseModel responseModel = new ApiResponseModel();
        responseModel.setData(null);
        responseModel.setMessage(message);
        responseModel.setStatusCode(404);
        return new ResponseEntity<>(responseModel, HttpStatus.NOT_FOUND);
    }
}
