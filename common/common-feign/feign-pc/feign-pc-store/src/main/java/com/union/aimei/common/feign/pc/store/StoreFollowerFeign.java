package com.union.aimei.common.feign.pc.store;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.feign.pc.store.hystrix.StoreFollowerApiHystrix;
import com.union.aimei.common.model.store.StoreFollower;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 店铺粉丝
 *
 * @author liurenkai
 * @time 2018/1/12 17:35
 */
@FeignClient(serviceId = "PC-STORE-SERVICE", fallback = StoreFollowerApiHystrix.class)
public interface StoreFollowerFeign {
    /**
     * 添加店铺粉丝
     *
     * @param storeFollower
     * @return
     */
    @PostMapping(value = "/storeFollower/insert")
    int insert(@RequestBody StoreFollower storeFollower);

    /**
     * 删除店铺粉丝
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/storeFollower/deleteById/{id}")
    int deleteById(@PathVariable(value = "id") int id);

    /**
     * 修改店铺粉丝
     *
     * @param storeFollower
     * @return
     */
    @PutMapping(value = "/storeFollower/edit")
    int edit(@RequestBody StoreFollower storeFollower);

    /**
     * 根据ID查询
     *
     * @param id
     * @returnstoreFollower
     */
    @GetMapping(value = "/storeFollower/queryById/{id}")
    StoreFollower queryById(@PathVariable(value = "id") int id);

    /**
     * 前端分页查询店铺粉丝
     *
     * @param pageNo        分页索引
     * @param pageSize      每页显示数量
     * @param storeFollower 查询条件
     * @return
     */
    @PostMapping(value = "/storeFollower/front/findByPage")
    PageInfo<StoreFollower> findByPageForFront(@RequestParam(value = "pageNo", defaultValue = "0")
                                                       Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10")
                                                       Integer pageSize, @RequestBody StoreFollower storeFollower);
}