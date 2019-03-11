package com.union.aimei.system.mapper;

import com.union.aimei.common.model.system.BaseSmsTemplate;
import com.union.aimei.common.model.system.BaseSmsTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author liufeihua
 */
public interface BaseSmsTemplateMapper {
    /**
     * 基本操作
     * @param example
     * @return
     */
    long countByExample(BaseSmsTemplateExample example);
    /**
     * 基本操作
     * @param example
     * @return
     */
    int deleteByExample(BaseSmsTemplateExample example);
    /**
     * 基本操作
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);
    /**
     * 基本操作
     * @param record
     * @return
     */
    int insert(BaseSmsTemplate record);
    /**
     * 基本操作
     * @param record
     * @return
     */
    int insertSelective(BaseSmsTemplate record);
    /**
     * 基本操作
     * @param example
     * @return
     */
    List<BaseSmsTemplate> selectByExample(BaseSmsTemplateExample example);
    /**
     * 基本操作
     * @param id
     * @return
     */
    BaseSmsTemplate selectByPrimaryKey(Integer id);
    /**
     * 更新
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") BaseSmsTemplate record, @Param("example") BaseSmsTemplateExample example);
    /**
     * 更新
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") BaseSmsTemplate record, @Param("example") BaseSmsTemplateExample example);
    /**
     * 基本操作
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(BaseSmsTemplate record);
    /**
     * 基本操作
     * @param record
     * @return
     */
    int updateByPrimaryKey(BaseSmsTemplate record);
    /**
     * 查看
     * @param offset
     * @param limit
     * @return
     */
    List<BaseSmsTemplate> selectByPage(@Param("offset") Long offset, @Param("limit") Long limit);
    /**
     * 基本操作
     * @param record
     * @return
     */
    List<BaseSmsTemplate> selectListByConditions(BaseSmsTemplate record);
}