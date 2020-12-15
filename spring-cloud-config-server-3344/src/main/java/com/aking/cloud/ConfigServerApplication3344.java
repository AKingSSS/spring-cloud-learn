package com.aking.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/15
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication3344.class, args);
    }
}
