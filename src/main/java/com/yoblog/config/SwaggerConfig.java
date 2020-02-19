package com.yoblog.config;

import com.alibaba.druid.sql.visitor.functions.Concat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author 章学魁
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yoblog.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("山山而川", "http://lcoalhost:8080/", "hellozachary@163.com");
        ApiInfo apiInfo = new ApiInfoBuilder()
                .contact(contact)
                .title("YO博客系统API接口列表")
                .description("此接口为多人博客管理系统使用")
                .version("vesion 1.0")
                .build();
        return apiInfo;
    }
}
