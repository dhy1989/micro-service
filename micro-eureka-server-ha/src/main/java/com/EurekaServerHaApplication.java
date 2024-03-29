package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dinghy
 * @date
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerHaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerHaApplication.class,args);
    }
}
