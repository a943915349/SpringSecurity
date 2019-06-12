package com.wisdom.demo.springbootsecurity.util;

import org.apache.commons.lang3.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Base64;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * 2018/3/27
 *
 * @author ZhaoQian
 */
public class AesEncryptorUtils {

    private static final String PASSWORD = "e5195386-ea3b-4c91-b735-a3324b76d861";

    private static final String KEY_ALGORITHM = "AES";

    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";

    /**
     * AES 加密操作
     *
     * @param content
     *            待加密内容
     * @return 返回Base64转码后的加密数据
     */
    public static String encrypt(String content) {

        if (StringUtils.isBlank(content)) {
            return null;
        }
        try {
            // 创建密码器
            Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
            byte[] byteContent = content.getBytes(UTF_8.name());
            // 初始化为加密模式的密码器
            cipher.init(Cipher.ENCRYPT_MODE, getSecretKey());
            // 加密
            byte[] result = cipher.doFinal(byteContent);
            return Base64.getEncoder().encodeToString(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    /**
     * AES 解密操作
     *
     * @param content
     * @return
     */
    public static String decrypt(String content) {

        if (StringUtils.isBlank(content)) {
            return null;
        }
        try {
            // 实例化
            Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
            // 使用密钥初始化，设置为解密模式
            cipher.init(Cipher.DECRYPT_MODE, getSecretKey());
            // 执行操作
            byte[] result = cipher.doFinal(Base64.getDecoder().decode(content));
            return new String(result, UTF_8.name());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 生成加密秘钥
     *
     * @return
     */
    private static SecretKeySpec getSecretKey() {

        // 返回生成指定算法密钥生成器的 KeyGenerator 对象
        KeyGenerator kg;
        try {
            kg = KeyGenerator.getInstance(KEY_ALGORITHM);
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(PASSWORD.getBytes());
            // AES 要求密钥长度为 128
            kg.init(128, random);
            // 生成一个密钥
            SecretKey secretKey = kg.generateKey();
            // 转换为AES专用密钥
            return new SecretKeySpec(secretKey.getEncoded(), KEY_ALGORITHM);
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }

        return null;
    }


    public static void main(String[] args) {
        System.out.println(Duration.between(LocalDateTime.now(),LocalDateTime.now()).toMinutes());
    }
}
