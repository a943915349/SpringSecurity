package com.wisdom.demo.springbootsecurity.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Wisdom
 */
@Data
public class Menu  {
    private String id;
    private String icon;
    private String name;
    private String authority;
    private String url;
    private Integer type;
    private Integer parent_id;
    private String sort;
    private Date created_time;
    private Date modified_time;
    private Integer status;
    private boolean is_delete ;

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }
}
