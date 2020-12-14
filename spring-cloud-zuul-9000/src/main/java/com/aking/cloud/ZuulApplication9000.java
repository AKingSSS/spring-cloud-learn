package com.aking.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/14
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication9000 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication9000.class, args);
    }
}
