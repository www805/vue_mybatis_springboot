package com.zhuang.config.swagger;

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

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(""))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        //设置作者信息
        Contact contact = new Contact("庄","maomaos.com","289590076@qq.com");

        return new ApiInfoBuilder()
                .title("评论系统Api文档")
                .description("rest api 评论管理的接口都在这里")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact(contact)
                .version("1.0")
                .build();
    }

}
