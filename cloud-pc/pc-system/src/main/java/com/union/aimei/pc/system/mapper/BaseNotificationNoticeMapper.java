package com.union.aimei.pc.system.mapper;

import com.union.aimei.common.model.system.BaseNotificationNotice;
import com.union.aimei.common.model.system.BaseNotificationNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liufeihua
 */

public interface BaseNotificationNoticeMapper {
    /**
     * 统计
     * @param example
     * @return
     */
    long countByExample(BaseNotificationNoticeExample example);
    /**
     * 基本操作
     * @param example
     * @return
     */
    int deleteByExample(BaseNotificationNoticeExample example);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加
     *
     * @param record
     * @return
     */
    int insert(BaseNotificationNotice record);

    /**
     * 添加
     *
     * @param record
     * @return
     */
    int insertSelective(BaseNotificationNotice record);
    /**
     * 基本操作
     * @param example
     * @return
     */
    List<BaseNotificationNotice> selectByExample(BaseNotificationNoticeExample example);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    BaseNotificationNotice selectByPrimaryKey(Integer id);
    /**
     * 更新
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") BaseNotificationNotice record, @Param("example") BaseNotificationNoticeExample example);
    /**
     * 更新
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") BaseNotificationNotice record, @Param("example") BaseNotificationNoticeExample example);
    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(BaseNotificationNotice record);
    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(BaseNotificationNotice record);
    /**
     * 查看
     * @param offset
     * @param limit
     * @return
     */
    List<BaseNotificationNotice> selectByPage(@Param("offset") Long offset, @Param("limit") Long limit);
    /**
     * 查看
     * @param record
     * @return
     */
    List<BaseNotificationNotice> selectListByConditions(BaseNotificationNotice record);
}