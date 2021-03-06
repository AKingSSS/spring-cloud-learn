package com.aking.cloud;

import com.aking.myrule.CustomerRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

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
// 加载自定义的ribbon类
@RibbonClient(name = "SPRING-CLOUD-PROVIDER-LEARN", configuration = CustomerRule.class)
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
