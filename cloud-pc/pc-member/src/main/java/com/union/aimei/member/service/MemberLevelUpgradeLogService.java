package com.union.aimei.member.service;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.model.member.MemberLevelUpgradeLog;
import com.union.common.utils.base.SpringCloudBaseService;

/**
 * @author GaoWei
 * @describe 
 * @time 2018/1/9,14:44
*/
public interface MemberLevelUpgradeLogService extends SpringCloudBaseService<MemberLevelUpgradeLog> {
       /**
        * 前端分页查询会员成长值记录
        * @param pageNo  分页索引
        * @param pageSize  每页显示数量
        * @param memberLevelUpgradeLog 查询条件
        * @return 
        */
       PageInfo<MemberLevelUpgradeLog> findByPageForFront(Integer pageNo, Integer pageSize, MemberLevelUpgradeLog memberLevelUpgradeLog);
}