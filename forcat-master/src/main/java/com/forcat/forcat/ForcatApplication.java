package com.forcat.forcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableJpaAuditing
public class ForcatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForcatApplication.class, args);
    }

    @GetMapping(value = "/")
    public String HelloWorld(){
        return "Hello World";
    }
}
