package com.union.aimei.common.feign.pc.order;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.feign.pc.order.hystrix.OrderProductApiHystrix;
import com.union.aimei.common.model.order.OrderProduct;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 订单-项目-关联
 *
 * @author GaoWei
 * @time 2018/8/23 10:46
 */
@SuppressWarnings("ALL")
@FeignClient(serviceId = "pc-order-service", fallback = OrderProductApiHystrix.class)
public interface OrderProductFeign {
    /**
     * 添加订单--商品--关联
     *
     * @param orderProduct
     * @return
     */
    @PostMapping(value = "/orderProduct/insert")
    int insert(@RequestBody OrderProduct orderProduct);

    /**
     * 删除订单--商品--关联
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/orderProduct/deleteById/{id}")
    int deleteById(@PathVariable(value = "id") int id);

    /**
     * 修改订单--商品--关联
     *
     * @param orderProduct
     * @return
     */
    @PutMapping(value = "/orderProduct/edit")
    int edit(@RequestBody OrderProduct orderProduct);

    /**
     * 根据ID查询
     *
     * @param id
     * @returnorderProduct
     */
    @GetMapping(value = "/orderProduct/queryById/{id}")
    OrderProduct queryById(@PathVariable(value = "id") int id);

    /**
     * 前端分页查询订单--商品--关联
     *
     * @param pageNo       分页索引
     * @param pageSize     每页显示数量
     * @param orderProduct 查询条件
     * @return
     */
    @PostMapping(value = "/orderProduct/front/findByPage")
    PageInfo<OrderProduct> findByPageForFront(@RequestParam(value = "pageNo", defaultValue = "0")
                                                      Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10")
                                                      Integer pageSize, @RequestBody OrderProduct orderProduct);
}