package com.aking.cloud.service;

import com.aking.cloud.pojo.CrmRuleDO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/11
 */
@FeignClient(value = "SPRING-CLOUD-PROVIDER-LEARN", fallbackFactory = CrmRuleServiceFallbackFactory.class)
@Component
public interface CrmRuleService {
    /**
     * 添加
     * @param crmRuleDO
     * @return
     */
    @PostMapping("/addRule")
    public boolean addRule(@RequestBody CrmRuleDO crmRuleDO);

    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("/queryRuleById/{id}")
    public CrmRuleDO queryRuleById(@PathVariable("id") Long id);

    /**
     * 查询所有
     * @return
     */
    @GetMapping("queryAllRule")
    public List<CrmRuleDO> queryAllRule();
}
