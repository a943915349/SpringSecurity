package com.wisdom.demo.springbootsecurity.controller;

import com.wisdom.demo.springbootsecurity.entity.ReturnMessage;
import com.wisdom.demo.springbootsecurity.exception.AuthException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Wisdom
 */
@ControllerAdvice
public class AuthAdvice {
    @ExceptionHandler(AuthException.class)
    @ResponseBody
    public ReturnMessage handleAuthException(final AuthException ex) {
        ReturnMessage rt = new ReturnMessage();
        rt.setRetCode("-1");
        rt.setRetMsg(ex.getMessage());
        return rt;
    }
}
