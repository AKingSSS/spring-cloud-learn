package com.aking.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/12
 */
@SpringBootApplication
@EnableEurekaServer  // 服务端启动类，接受别人注册
public class Eurekaserverapplication_7002 {
    public static void main(String[] args) {
        SpringApplication.run(Eurekaserverapplication_7002.class, args);
    }

}
