package com.aking.cloud.service.impl;

import com.aking.cloud.dao.CrmRuleDao;
import com.aking.cloud.pojo.CrmRuleDO;
import com.aking.cloud.service.CrmRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/11
 */
@Service
public class CrmRuleServiceImpl implements CrmRuleService {
    @Autowired
    private CrmRuleDao crmRuleDao;
    /**
     * 添加
     *
     * @param crmRuleDO
     * @return
     */
    @Override
    public boolean addRule(CrmRuleDO crmRuleDO) {

        return crmRuleDao.addRule(crmRuleDO);
    }

    /**
     * 查询
     *
     * @param id
     * @return
     */
    @Override
    public CrmRuleDO queryRuleById(Long id) {
        return crmRuleDao.queryRuleById(id);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<CrmRuleDO> queryAllRule() {
        return crmRuleDao.queryAllRule();
    }
}
