package com.teset.dao;

import com.teset.model.JobAndTriggerVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * create by yaodd on 2020/8/24
 */
@Mapper
public interface JobMapper {

    List<JobAndTriggerVo> list();

}
