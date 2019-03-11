package com.union.aimei.common.feign.app.order;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.feign.app.order.hystrix.OrderRefundsConsultRecordApiHystrix;
import com.union.aimei.common.model.order.OrderRefundsConsultRecord;
import com.union.common.utils.ResponseMessage;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 服务订单-退款协商记录
 *
 * @author GaoWei
 * @time 2018/8/23 10:28
 */
@FeignClient(serviceId = "APP-ORDER-SERVICE", fallback = OrderRefundsConsultRecordApiHystrix.class)
public interface OrderRefundsConsultRecordFeign {
    /**
     * 添加服务订单-退款协商记录表
     *
     * @param orderRefundsConsultRecord
     * @return
     */
    @PostMapping(value = "/orderRefundsConsultRecord/insert")
    int insert(@RequestBody OrderRefundsConsultRecord orderRefundsConsultRecord);

    /**
     * 删除服务订单-退款协商记录表
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/orderRefundsConsultRecord/deleteById/{id}")
    int deleteById(@PathVariable(value = "id") int id);

    /**
     * 修改服务订单-退款协商记录表
     *
     * @param orderRefundsConsultRecord
     * @return
     */
    @PutMapping(value = "/orderRefundsConsultRecord/edit")
    int edit(@RequestBody OrderRefundsConsultRecord orderRefundsConsultRecord);

    /**
     * 根据ID查询
     *
     * @param id
     * @returnorderRefundsConsultRecord
     */
    @GetMapping(value = "/orderRefundsConsultRecord/queryById/{id}")
    OrderRefundsConsultRecord queryById(@PathVariable(value = "id") int id);

    /**
     * 前端分页查询服务订单-退款协商记录表
     *
     * @param pageNo                    分页索引
     * @param pageSize                  每页显示数量
     * @param orderRefundsConsultRecord 查询条件
     * @return
     */
    @PostMapping(value = "/orderRefundsConsultRecord/front/findByPage")
    PageInfo<OrderRefundsConsultRecord> findByPageForFront(@RequestParam(value = "pageNo", defaultValue = "0")
                                                                   Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10")
                                                                   Integer pageSize, @RequestBody OrderRefundsConsultRecord orderRefundsConsultRecord);

    /**
     * 通过订单编号查询协商记录
     *
     * @param pageNo   分页索引
     * @param pageSize 每页数量
     * @param orderNo  订单号
     * @return
     */
    @GetMapping(value = "/orderRefundsConsultRecord/queryConsultRecords/{orderNo}")
    ResponseMessage queryConsultRecords(
            @RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @PathVariable(value = "orderNo") String orderNo);
}