package com.wisdom.demo.springbootsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 添加redis配置类启用redis代码spring默认session
 * @author Wisdom
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
