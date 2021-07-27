package com.teset.job;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class Hello3Job extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		// 获取参数
		JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();

		System.err.println("hello world 3333333333");
	}
}