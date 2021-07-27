package com.teset.controller;

import com.teset.common.R;
import com.teset.model.JobAndTriggerVo;
import com.teset.service.QuartzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuartzController {

    @Autowired
    private QuartzService quartzService;

    /**
     * 暂停任务
     */
    @PostMapping("/pause")
    public R pauseTask(String jName, String jGroup) {
        try {
            quartzService.pauseJob(jName, jGroup);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
    }

    /**
     * 新增任务
     */
    @PostMapping("/insert")
    public R insertTask(@RequestBody JobAndTriggerVo jobAndTriggerVo) {
        quartzService.addJob(jobAndTriggerVo);
        return R.ok();
    }

    @PostMapping("/update")
    public R updateJob(@RequestBody JobAndTriggerVo jobAndTriggerVo) {
        try {
            quartzService.updateJob(jobAndTriggerVo.getTriggerName(),jobAndTriggerVo.getTriggerGroupName(),jobAndTriggerVo.getCronExpression());
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
    }

    /**
     * 查询全部
     */
    @GetMapping("/list")
    public  List<JobAndTriggerVo> list() {
        // List<Map<String, Object>> maps = quartzService.queryAllJob();
        List<JobAndTriggerVo> list = quartzService.list();
        return list;
    }
    /**
     * 立即运行
     */
    @PostMapping("/runAJobNow")
    public  R runAJobNow(String jName, String jGroup) {
        try {
            quartzService.runAJobNow(jName,jGroup);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
    }


    /**
     * 继续任务
     */
    @PostMapping("/resume")
    public R resumeTask(String jName, String jGroup) {
        try {
            quartzService.resumeJob(jName, jGroup);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
    }

    /**
     * 删除任务
     */
    @PostMapping("/delete")
    public R deleteTask(String jName, String jGroup) {
        try {
            quartzService.deleteJob(jName, jGroup);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
    }

}