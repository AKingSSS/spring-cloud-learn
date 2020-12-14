package com.aking.cloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/12
 */
// 启动类
@SpringBootApplication
@MapperScan("com.aking.cloud.dao")
@EnableEurekaClient   // 在服务启动后自动注册到 eureka 服务中
@EnableCircuitBreaker     // 添加对熔断的支持
public class ProviderApplication8381 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication8381.class, args);
    }

    // 增加一个servlet
    @Bean
    public ServletRegistrationBean getBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        servletRegistrationBean.addUrlMappings("/hystrix.stream");
        return servletRegistrationBean;
    }
}
