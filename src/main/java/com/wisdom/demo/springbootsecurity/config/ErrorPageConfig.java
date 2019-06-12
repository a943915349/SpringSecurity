package com.wisdom.demo.springbootsecurity.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @author Wisdom
 */
@Configuration
public class ErrorPageConfig implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry errorPageRegistry) {
        //1、按错误的类型显示错误的网页
        // 错误类型为404，找不到网页的，默认显示404.html网页
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND, "/404");
        //错误类型为500，表示服务器响应错误，默认显示500.html网页
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500");
        ErrorPage e403 = new ErrorPage(HttpStatus.FORBIDDEN, "/403");
        errorPageRegistry.addErrorPages(e404, e500,e403);
    }

}
