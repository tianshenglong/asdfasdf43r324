package com.sinochem.vmarine.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SinochemVmarineFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(SinochemVmarineFrontApplication.class, args);
    }

    @Bean
    public ServletWebServerFactory servletContainer() {
        UndertowServletWebServerFactory undertow = new UndertowServletWebServerFactory();
        return undertow;
    }
}
