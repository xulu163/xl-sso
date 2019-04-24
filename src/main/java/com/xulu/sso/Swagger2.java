package com.xulu.sso;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Map;

@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wolves.mouse.controller"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .ignoredParameterTypes(Map.class);
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("xl-sso", "https://github.com/xulu163/xl-sso", "java_xul@163.com");
        ApiInfo apiInfo = new ApiInfo("xl-sso APIs",//大标题
                        "a sso product using springSession",
                "1.0",
                "https://github.com/xulu163/xl-sso",
                contact,
                "xulu",
                "https://github.com/xulu163"
        );
        return apiInfo;

    }

}
