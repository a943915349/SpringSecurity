package com.wisdom.demo.springbootsecurity.entity;

import lombok.Data;

/**
 * @author Wisdom
 */
@Data
public class Menu  {
    private Integer id;
    private String name;
    private String url;
    private String icon;
    private Integer parentId;

}
