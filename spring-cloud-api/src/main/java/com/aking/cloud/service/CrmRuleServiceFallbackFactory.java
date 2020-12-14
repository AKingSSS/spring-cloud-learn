package com.aking.cloud.service;

import com.aking.cloud.pojo.CrmRuleDO;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 降级
 * </p>
 *
 * @author yk
 * @date 2020/12/13
 */
@Component
public class CrmRuleServiceFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new CrmRuleService() {
            @Override
            public boolean addRule(CrmRuleDO crmRuleDO) {
                return false;
            }

            @Override
            public CrmRuleDO queryRuleById(Long id) {
                return new CrmRuleDO(999, "服务正在加紧维修，请稍后再试！");
            }

            @Override
            public List<CrmRuleDO> queryAllRule() {
                return null;
            }
        };
    }
}
