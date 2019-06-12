package com.wisdom.demo.springbootsecurity.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Wisdom
 */
@Setter
@Getter
public class AuthException extends Exception{
    private String msg;
    public AuthException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
