package com.aking.cloud.controller;

import com.aking.cloud.pojo.CrmRuleDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aking.cloud.service.CrmRuleService;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/11
 */
@RestController
@Slf4j
public class CrmRuleController {
    @Autowired
    private CrmRuleService crmRuleService;

    @PostMapping("/addRule")
    public boolean addRule(@RequestBody CrmRuleDO crmRuleDO) {
        return crmRuleService.addRule(crmRuleDO);
    }

    @GetMapping("/queryRuleById/{id}")
    public CrmRuleDO queryRuleById(@PathVariable("id") Long id) {
        return crmRuleService.queryRuleById(id);
    }

    @GetMapping("queryAllRule")
    public List<CrmRuleDO> queryAllRule() {
        log.info("spring-cloud-provider-8181 服务提供");
        return crmRuleService.queryAllRule();
    }
}
