package com.aking.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/15
 */
@RestController
public class ConfigController {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig() {
        return "applicationName: " + applicationName +
                ";eurekaServer: " + eurekaServer +
                ";port: " +port;
    }
}
