package com.jwtsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*@Configuration
@ComponentScan
@EnableAutoConfiguration*/
@SpringBootApplication  //equivalent to following three
public class JwtSecurityApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(JwtSecurityApplication.class, args);

        for (String name : applicationContext.getBeanDefinitionNames()) {

            System.out.println(name);
        }
    }

    @Override
    public void run(String... args) {
        //this method will after context initialization
    }
}
