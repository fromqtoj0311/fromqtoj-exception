package com.fromqtoj.exception;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(BusinessException.class)
  @ResponseBody
  public String jsonErrorHandler(BusinessException exception) {
    return JSON.toJSONString(exception.getErrorMessage());
  }
}
