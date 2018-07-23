package com.fromqtoj.exception;

public class ErrorMessage {
  public static final int UNKNOWN_ERROR_CODE = 0;
  public static final ErrorMessage UNKNOWN_ERROR_MESSAGE =
      (new ErrorMessage()).withCode(0).withMessage("未知异常");
  private int code;
  private String message;

  public ErrorMessage() {}

  public int getCode() {
    return this.code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public ErrorMessage withCode(int code) {
    this.setCode(code);
    return this;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorMessage withMessage(String message) {
    this.setMessage(message);
    return this;
  }
}
