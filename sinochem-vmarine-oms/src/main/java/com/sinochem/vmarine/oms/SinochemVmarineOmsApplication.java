package com.sinochem.vmarine.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SinochemVmarineOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SinochemVmarineOmsApplication.class, args);
        System.out.println("SinochemVmarineOmsApplication 启动成功！");
    }

    @Bean
    public ServletWebServerFactory servletContainer() {
        UndertowServletWebServerFactory undertow = new UndertowServletWebServerFactory();
        return undertow;
    }
}
