package com.aking.cloud.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 规则定义
 * </p>
 *
 * @author Y10003453
 * @date 2020-11-05 16:36:50
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) // 链式写法
public class CrmRuleDO implements Serializable {
    private static final long serialVersionUID = -7606376461378630247L;

    public CrmRuleDO(Integer ruleCode, String ruleContent) {
        this.ruleCode = ruleCode;
        this.ruleContent = ruleContent;
    }
    /**
     * 规则code
     */
    private Integer ruleCode;
    /**
     * 规则
     */
    private String ruleContent;
    /**
     * 适用角色
     */
    private String applicableRole;
    /**
     * 规则数字
     */
    private String ruleAmount;
    /**
     * 备注
     */
    private String remark;

    private Long id;
    private Long creatorId;
    private Long lastModifierId;
    private Date createTime;
    private Date modifiedTime;
    private Integer deleted;


    public static void main(String[] args) {
        // 链式写法
        CrmRuleDO crmRuleDO = new CrmRuleDO();
        crmRuleDO.setRuleCode(999)
                .setRuleContent("感冒灵颗粒");
    }
}