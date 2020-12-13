package com.aking.cloud.config;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/12
 */
@Configuration
public class ConfigBean {

    // 配置负载均衡实现 IRule
    @Bean
    @LoadBalanced  // Ribbon
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

/*    @Bean
    public IRule iRule() {
        return new RandomRule();
    }*/


}
