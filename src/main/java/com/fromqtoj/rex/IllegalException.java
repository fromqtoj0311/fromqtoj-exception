package com.fromqtoj.rex;

import com.fromqtoj.exception.BusinessException;
import com.fromqtoj.exception.ErrorMessage;

public class IllegalException extends MailServiceException {
  public IllegalException() {
    super(BusinessException.ILLEGAL_ARG_CODE);
  }

  public IllegalException(String message) {
    super(BusinessException.ILLEGAL_ARG_CODE, message);
  }

  public IllegalException(String message, Throwable cause) {
    super(
        new ErrorMessage().withCode(BusinessException.ILLEGAL_ARG_CODE).withMessage(message),
        cause);
  }
}
