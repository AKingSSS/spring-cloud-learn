package com.aking.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/12
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.aking.cloud"})
public class FeignConsumerApplication8083 {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication8083.class, args);
    }
}
