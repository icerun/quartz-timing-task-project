package com.teset;

import com.teset.dao.JobMapper;
import com.teset.model.JobAndTriggerVo;
import com.teset.service.QuartzService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Quartz02BootApplicationTests {

    @Autowired
    private QuartzService quartzService;

    @Autowired
    private JobMapper jobMapper;


    @Test
    public void test1(){
        List<JobAndTriggerVo> list = jobMapper.list();
        System.out.println(list);
    }


}
