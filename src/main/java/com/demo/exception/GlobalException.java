package com.demo.exception;

  import com.demo.utils.ApiResponseModel;
  import com.demo.utils.CommonUtils;
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.concurrent.atomic.AtomicReference;


@ControllerAdvice
public class GlobalException {
    @Autowired
    CommonUtils commonUtils;
    @ExceptionHandler
    public ResponseEntity<ApiResponseModel> exception(UserNotFoundException exception) {
        return commonUtils.notFoundResponse(exception.getMessage());
    }

}
