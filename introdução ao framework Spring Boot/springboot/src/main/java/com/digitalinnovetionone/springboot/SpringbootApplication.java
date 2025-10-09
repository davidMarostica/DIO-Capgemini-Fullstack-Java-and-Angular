package com.digitalinnovetionone.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // <-- IMPORTANTE!

@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer { // <--- 1. HERDAR ISTO!

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    // <--- 2. ADICIONAR ESTE MÉTODO!
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootApplication.class);
    }
}