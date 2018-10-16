package com.ryu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringbootMybatisApplication {

    private static Logger LOGGER = Logger.getLogger("SpringbootMybatisApplication");

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
        LOGGER.info("============SpringBoot Start Successfully!==============");
    }
}
