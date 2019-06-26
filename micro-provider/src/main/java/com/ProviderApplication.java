package com;

import com.demo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author dinghy
 * @date
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {
    @Bean
    public ConcurrentHashMap<Long, User> concurrentHashMap() {
        ConcurrentHashMap<Long, User> map = new ConcurrentHashMap<>();
        for (long i = 1; i < 21; i++) {
            Random random = new Random();
            map.put(i, new User(i,"张三" + i, random.nextInt(100), random.nextDouble()));
        }
        return map;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
