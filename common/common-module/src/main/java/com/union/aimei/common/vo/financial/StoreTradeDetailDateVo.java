package com.union.aimei.common.vo.financial;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
/**
 * @author liufeihua
 */
@Data
@EqualsAndHashCode
@ApiModel(value = "店铺交易")
public class StoreTradeDetailDateVo implements Serializable {

    @ApiModelProperty("交易流水id")
    private Integer id;

    @ApiModelProperty("门店ID")
    private Integer storeId;

    @ApiModelProperty("美容师")
    private Integer beauticianId;

    @ApiModelProperty("店铺注册的手机号码")
    private String storePhone;

    @ApiModelProperty("门店名称")
    private String storeName;

    @ApiModelProperty("美容师名字")
    private String beauticianName;

    @ApiModelProperty("订单编号")
    private String orderNo;

    @ApiModelProperty("交易类型(1-服务提成,，2-售卡奖励，3-退款")
    private Integer tradeType;

    @ApiModelProperty("结算状态:0-待结算 1-已结算")
    private Integer settlementStatus;

    @ApiModelProperty("付款时间")
    private Date payTime;

    @ApiModelProperty("交易状态:0未完成,1-已完成")
    private Integer tradeStatus;

    @ApiModelProperty("订单总金额")
    private Integer totalAmount;

    @ApiModelProperty("优惠金额")
    private Integer discountsAmount;

    @ApiModelProperty("服务单价")
    private Integer productPrice;

    @ApiModelProperty("商品打折折扣")
    private Integer productDiscount;

    @ApiModelProperty("服务名称")
    private String productName;

    @ApiModelProperty("会员卡打折折扣")
    private Integer cardDiscount;

    private Integer cardPrice;

    private String cardName;

    @ApiModelProperty("消费者实付")
    private Integer actualPay;

    @ApiModelProperty("销售奖励")
    private Integer incentive;

    @ApiModelProperty("员工提成")
    private Integer memberDeduct;

    @ApiModelProperty("净收入")
    private Integer netAmount;

    @ApiModelProperty("支付方式")
    private Integer payMethod;

    @ApiModelProperty("支付比率")
    private Integer payRate;

    @ApiModelProperty("结算金额")
    private Integer settleAmount;

    @ApiModelProperty("退款金额")
    private Integer reimburseAmount;

    @ApiModelProperty("结算时间")
    private Date settlementTime;

    @ApiModelProperty("退款时间")
    private Date reimburseTime;

    @ApiModelProperty("提现申请金额")
    private Integer withdrawAmount;

    @ApiModelProperty("服务完成时间年份")
    private String statisticsYear;

    @ApiModelProperty("服务完成时间年份月份")
    private String statisticsYearMonth;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("备注")
    private String remarks;

    @ApiModelProperty(value = "筛选开始时间")
    private String startTime;

    @ApiModelProperty(value = "筛选结束时间")
    private String endTime;

    private static final long serialVersionUID = 1L;

}