package com.aking.cloud.controller;

import com.aking.cloud.constant.RestUrlConstant;
import com.aking.cloud.pojo.CrmRuleDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/12
 */
@RestController
@Slf4j
public class CrmRuleConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/queryAllRules")
    public List<CrmRuleDO> queryAllRules() {
        return  restTemplate.getForObject(RestUrlConstant.REST_URL_PREFIX + "/queryAllRule",
                List.class);
    }
}
