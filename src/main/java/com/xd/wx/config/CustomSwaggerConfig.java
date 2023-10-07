package com.xd.wx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: daizuquan
 * @date: 2023/9/25 16:39
 * @description:
 */
public class CustomSwaggerConfig {

    @Configuration
    @EnableSwagger2
    public static class SwaggerConfig {
        @Bean
        public Docket webApiConfig(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .groupName("webApi")
                    .apiInfo(webApiInfo())
                    .select()
                    .build();
        }

        private ApiInfo webApiInfo() {
            return new ApiInfoBuilder()
                    .title("电商平台")
                    .description("本文档描述了某某电商平台微服务接口定义")
                    .version("1.0")
                    .contact(new Contact("xxxx", "http://somc.top", "xxx@163.com"))
                    .build();

        }

    }
}
