package com.aking.cloud.controller;

import com.aking.cloud.pojo.CrmRuleDO;
import com.aking.cloud.service.CrmRuleService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @HystrixCommand(fallbackMethod = "hystrixQueryRule")
    public CrmRuleDO queryRuleById(@PathVariable("id") Long id) {
        CrmRuleDO crmRuleDO = crmRuleService.queryRuleById(id);
        if (crmRuleDO == null) {
            throw new RuntimeException("id="+ id + "，不存在该规则");
        }
        return crmRuleDO;
    }

    @GetMapping("queryAllRule")
    public List<CrmRuleDO> queryAllRule() {
        return crmRuleService.queryAllRule();
    }

    /**
     * 熔断方法
     * @param id
     * @return
     */
    public CrmRuleDO hystrixQueryRule(@PathVariable("id") Long id) {
        return new CrmRuleDO(999, "不存在该规则！");
    }


}
