package com.wisdom.demo.springbootsecurity.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Wisdom
 */
@Data
public class User  implements UserDetails,Serializable {
    private static final long serialVersionUID = 6136355709442355104L;
    private String id;
    private String username;
    private String nickname;
    private String admin;
    private String password;
    private Date createDate;
    private Date modified_time;
    private Integer status;
    private boolean is_delete;
    private List<? extends GrantedAuthority> authorities;
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}
