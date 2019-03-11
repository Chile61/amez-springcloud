package com.union.aimei.pc.product.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.union.aimei.common.model.product.PhysicalCategory;
import com.union.aimei.pc.product.mapper.PhysicalCategoryMapper;
import com.union.aimei.pc.product.service.PhysicalCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author caizhaoming
 * @version 1.1
 * @create 2018-06-21 11:43
 **/
@Service("physicalCategoryService")
public class PhysicalCategoryServiceImpl implements PhysicalCategoryService {
    @Resource
    private PhysicalCategoryMapper physicalCategoryMapper;

    /**
     * 前端分页查询产品分类
     *
     * @param pageNo           分页索引
     * @param pageSize         每页显示数量
     * @param physicalCategory 查询条件
     * @return
     */
    @Override
    public PageInfo<PhysicalCategory> findByPageForFront(Integer pageNo, Integer pageSize, PhysicalCategory physicalCategory) {
        PageHelper.startPage(pageNo, pageSize);
        List<PhysicalCategory> list = this.physicalCategoryMapper.selectListByConditions(physicalCategory);
        PageInfo<PhysicalCategory> page = new PageInfo<>(list);
        return page;
    }

    /**
     * 添加产品分类
     *
     * @param t
     * @return
     */
    @Override
    public int addObj(PhysicalCategory t) {
        return this.physicalCategoryMapper.insertSelective(t);
    }

    /**
     * 删除产品分类
     *
     * @param id
     * @return
     */
    @Override
    public int deleteObjById(int id) {
        PhysicalCategory physicalCategory = new PhysicalCategory();
        physicalCategory.setId(id);
        physicalCategory.setIsEnabled(PhysicalCategory.IS_ENABLED_FALSE);
        return this.physicalCategoryMapper.updateByPrimaryKeySelective(physicalCategory);
    }

    /**
     * 修改产品分类
     *
     * @param t
     * @return
     */
    @Override
    public int modifyObj(PhysicalCategory t) {
        return this.physicalCategoryMapper.updateByPrimaryKeySelective(t);
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @returnphysicalCategory
     */
    @Override
    public PhysicalCategory queryObjById(int id) {
        PhysicalCategory model = this.physicalCategoryMapper.selectByPrimaryKey(id);
        return model;
    }
}