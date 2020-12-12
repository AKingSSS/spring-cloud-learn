package com.aking.cloud.controller;

import com.aking.cloud.pojo.CrmRuleDO;
import com.aking.cloud.service.CrmRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class CrmRuleController {
    @Autowired
    private CrmRuleService crmRuleService;

    @PostMapping("/addRule")
    public boolean addRule(CrmRuleDO crmRuleDO) {
        return crmRuleService.addRule(crmRuleDO);
    }

    @GetMapping("/queryRuleById")
    public CrmRuleDO queryRuleById(Long id) {
        return crmRuleService.queryRuleById(id);
    }

    @GetMapping("queryAllRule")
    public List<CrmRuleDO> queryAllRule() {
        return crmRuleService.queryAllRule();
    }
}
