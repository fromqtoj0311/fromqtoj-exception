package com.fromqtoj.controller;

import com.fromqtoj.exception.BusinessException;
import com.fromqtoj.rex.IllegalException;
import com.fromqtoj.rex.MailServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常
 * @auther:
 * @date: 2018/7/5 17:53
 */
@Controller
@RequestMapping("/a")
public class ChooseControllerDemo {

  @RequestMapping("/b")
  @ResponseBody
  public String getIsApply(HttpServletRequest request) {
    try {
      throw new IllegalException("我这里有一个异常信息");
    } catch (MailServiceException e) {
      throw new BusinessException(e.getCode(), e.getMessage());
    }
  }
}
