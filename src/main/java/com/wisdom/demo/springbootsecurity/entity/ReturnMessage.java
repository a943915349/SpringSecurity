package com.wisdom.demo.springbootsecurity.entity;

import lombok.Data;

import java.util.List;

/**
 * @author Wisdom
 */
@Data
public class ReturnMessage {
    private String retCode;
    private String retMsg;
    private Object retBean;
    private List<Object> retBeans;
}
