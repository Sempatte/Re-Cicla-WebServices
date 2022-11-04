package com.recicla.ga.ReCicla_WS.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDocket() throws IOException {

        Runtime rt = Runtime.getRuntime();
        String url = "http://localhost:8080/swagger-ui.html";
        rt.exec("rundll32 url.dll,FileProtocolHandler " + url);

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.recicla.ga.ReCicla_WS.controllers"))
                .paths(PathSelectors.any())
                .build();
    }

}
