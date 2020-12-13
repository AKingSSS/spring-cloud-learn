package com.aking.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/13
 */
@Configuration
public class CustomerRule {

    @Bean
    public IRule myRule() {
        return new MyRandomRule();
    }

}
