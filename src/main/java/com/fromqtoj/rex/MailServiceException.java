package com.fromqtoj.rex;

import com.fromqtoj.exception.ErrorMessage;

public abstract class MailServiceException extends ErrorMessageException {

  public MailServiceException(int code) {
    super(new ErrorMessage().withCode(code));
  }

  public MailServiceException(int code, String message) {
    super(new ErrorMessage().withCode(code).withMessage(message));
  }

  public MailServiceException(ErrorMessage errorMessage, Throwable cause) {
    super(errorMessage, cause);
  }

  public int getCode() {
    return getErrorMessage().getCode();
  }
}
