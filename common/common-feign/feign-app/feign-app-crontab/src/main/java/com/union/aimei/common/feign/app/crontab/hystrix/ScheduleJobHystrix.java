package com.union.aimei.common.feign.app.crontab.hystrix;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.feign.app.crontab.ScheduleJobFeign;
import com.union.aimei.common.model.crontab.ScheduleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author dell
 */
@Component(value = "app-ScheduleJobFeign")
public class ScheduleJobHystrix implements ScheduleJobFeign {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 1;
    }

    @Override
    public int insertSelective(ScheduleJob record) {
        return 1;
    }

    @Override
    public ScheduleJob selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ScheduleJob record) {
        return 1;
    }

    @Override
    public PageInfo<ScheduleJob> selectListByConditions(Integer pageNo, Integer pageSize, ScheduleJob record) {
        return null;
    }
}