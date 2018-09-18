package com.jwtsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
//@SpringBootApplication equivalent to following three

public class JwtSecurityApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(JwtSecurityApplication.class, args);

        for (String name : applicationContext.getBeanDefinitionNames()) {

            System.out.println(name);
        }
    }
}
