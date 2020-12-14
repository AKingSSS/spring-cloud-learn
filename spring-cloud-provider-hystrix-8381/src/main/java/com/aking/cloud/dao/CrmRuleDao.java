package com.aking.cloud.dao;

import com.aking.cloud.pojo.CrmRuleDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020/12/11
 */
@Mapper
@Repository
public interface CrmRuleDao {
    /**
     * 添加
     * @param crmRuleDO
     * @return
     */
    public boolean addRule(CrmRuleDO crmRuleDO);

    /**
     * 查询
     * @param id
     * @return
     */
    public CrmRuleDO queryRuleById(Long id);

    /**
     * 查询所有
     * @return
     */
    public List<CrmRuleDO> queryAllRule();

}
