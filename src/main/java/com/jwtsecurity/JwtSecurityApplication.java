package com.jwtsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*@Configuration
@ComponentScan
@EnableAutoConfiguration*/
@SpringBootApplication  //equivalent to following three
public class JwtSecurityApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(JwtSecurityApplication.class, args);

        for (String name : applicationContext.getBeanDefinitionNames()) {

            System.out.println(name);
        }
    }
}
