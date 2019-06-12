package com.wisdom.demo.springbootsecurity.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Wisdom
 */
@Configuration
public class SwaggerConfig {

    private static final String VERSION = "1.1.0-RC1";

    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                                                      // .paths(PathSelectors.ant("/api/parking/*"))//过滤的接口
                                                      .build().apiInfo(apiInfo());
    }
    private ApiInfo apiInfo() {

        return new ApiInfoBuilder().title("demo小练习").termsOfServiceUrl("").version(VERSION).contact(
                new Contact("demo小练习", "http://www.shijinet.cn", "Kunlun")).build();
    }
}