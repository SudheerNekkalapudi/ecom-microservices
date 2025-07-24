package com.ecom.cart_serviceconfig;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Cart Service API")
                .version("1.0")
                .description("API documentation for the Product microservice"));
    }
}
