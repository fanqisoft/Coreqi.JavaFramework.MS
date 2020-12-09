package cn.coreqi.core.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Bean
    public Docket wxDocket() {

        return new Docket(DocumentationType.OAS_30)
                .groupName("api")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.coreqi.api.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Coreqi-API Doc")
                .description("Coreqi.JavaFramework开发框架")
                .termsOfServiceUrl("https://www.coreqi.cn")
                .contact(new Contact("fanqi","https://www.coreqi.cn","fanqisoft@vip.qq.com"))
                .version("2.0 beta0")
                .build();
    }
}
