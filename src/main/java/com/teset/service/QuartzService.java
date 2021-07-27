package com.teset.service;

import com.teset.model.JobAndTriggerVo;
import org.quartz.SchedulerException;

import java.util.List;
import java.util.Map;


public interface QuartzService {
    /**
     * 新增一个定时任务
     */
    void addJob(JobAndTriggerVo jobAndTriggerVo);

    /**
     * 暂停定时任务
     */
    void pauseJob(String jName, String jGroup);


    /**
     * 暂停所有定时任务
     */
    void pauseAllJob();

    /**
     * 继续定时任务
     */
    void resumeJob(String jName, String jGroup);

    /**
     * 恢复所有定时任务
     */
    void resumeAllJob();

    /**
     * 删除定时任务
     */
    void deleteJob(String jName, String jGroup);

    /**
     * 立即执行一个job
     */
    public void runAJobNow(String jobName, String jobGroupName);

    /**
     * 获取所有计划中的任务列表
     */
    public List<JobAndTriggerVo> list();

    /**
     * 修改
     */
    public void updateJob(String triggerName, String triggerGroupName, String cronExpression) throws SchedulerException;


}