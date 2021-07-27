package com.teset.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class JobAndTriggerVo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    // 类名
    private String jobName;
    // 描述
    private String jobDescription;
    // 组
    private String jobGroupName;
    // 类名
    private String jobClassName;
    // 触发类
    private String triggerName;
    // 触发组
    private String triggerGroupName;
    // 上次执行时间
    private String prevFireTime;
    // 下次执行时间
    private String nextFireTime;
    // 时间表达式
    private String cronExpression;
    // 状态
    private String triggerState;
}