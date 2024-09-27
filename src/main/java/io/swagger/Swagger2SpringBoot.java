package io.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.swagger", "io.swagger.api", "io.swagger.configuration"})
public class Swagger2SpringBoot {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Swagger2SpringBoot.class, args);
    }

}
