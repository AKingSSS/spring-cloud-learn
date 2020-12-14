package com.aking.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/14
 */
@SpringBootApplication
@EnableHystrixDashboard // 开启
public class CustomerHystrixDashboardApplication8084 {
    public static void main(String[] args) {
        SpringApplication.run(CustomerHystrixDashboardApplication8084.class, args);
    }
}
