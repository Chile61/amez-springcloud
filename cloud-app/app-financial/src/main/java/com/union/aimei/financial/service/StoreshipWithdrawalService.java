package com.union.aimei.financial.service;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.model.financial.StoreshipWithdrawal;
import com.union.common.utils.ResponseMessage;

import java.util.List;
/**
 * @author liufeihua
 */
public interface StoreshipWithdrawalService {
    /**
     * 基本操作
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);
    /**
     * 基本操作
     * @param record
     * @return
     */
    int insertSelective(StoreshipWithdrawal record);
    /**
     * 基本操作
     *
     * @param id
     * @return
     */
    StoreshipWithdrawal selectByPrimaryKey(Integer id);
    /**
     * 基本操作
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(StoreshipWithdrawal record);
    /**
     * 查看
     * @param pageNo
     * @param pageSize
     * @param record
     * @return
     */
    PageInfo<StoreshipWithdrawal> selectListByConditions(Integer pageNo, Integer pageSize, StoreshipWithdrawal record);

    /**
     * 根据条件查询列表（V1.1.0）
     *
     * @param record
     * @return
     */
    ResponseMessage<List<StoreshipWithdrawal>> selectListByConditionsV110(StoreshipWithdrawal record);

}