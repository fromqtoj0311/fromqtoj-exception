package com.fromqtoj.exception;

public class BusinessException extends RuntimeException {

  public static final int ILLEGAL_ARG_CODE = 666;

  private ErrorMessage errorMessage;

  public BusinessException(int code) {
    this.errorMessage = new ErrorMessage().withCode(code);
  }

  public BusinessException(int code, String message) {
    this.errorMessage = new ErrorMessage().withCode(code).withMessage(message);
  }

  public BusinessException(ErrorMessage errorMessage, Throwable cause) {
    super(cause);
    this.errorMessage = errorMessage;
  }

  public ErrorMessage getErrorMessage() {
    return errorMessage;
  }
}
