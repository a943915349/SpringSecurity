package com.wisdom.demo.springbootsecurity.security;

import com.wisdom.demo.springbootsecurity.util.AesEncryptorUtils;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Wisdom
 */
public class Md5PasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return AesEncryptorUtils.encrypt((String) rawPassword);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        //MD5  32位小写加密方式
        return AesEncryptorUtils.decrypt((String) encodedPassword).contentEquals(rawPassword);
    }
}
