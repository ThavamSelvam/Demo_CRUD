package com.demo.utils;

import lombok.Data;

@Data
public class ApiResponseModel {
    private int statusCode;
    private String message;
    private Object data;


}
