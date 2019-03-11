package com.union.aimei.common.vo.financial;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;


/**
 * @author caizhaoming
 * @describe 美容师流水vo
 * @time 2018/6/6,16:58
 */
@Data
@EqualsAndHashCode
@ApiModel(value = "美容师流水vo")
public class BeauticianTradeDetailVo implements Serializable {

    @ApiModelProperty("交易流水id")
    private Integer id;

    @ApiModelProperty("门店ID")
    private Integer storeId;

    @ApiModelProperty("美容师")
    private Integer beauticianId;

    @ApiModelProperty("门店名称")
    private String storeName;

    @ApiModelProperty("美容师名字")
    private String beauticianName;

    @ApiModelProperty("美容师电话")
    private String beauticianPhone;

    @ApiModelProperty("美容师类型，0-兼职，1-全职")
    private Byte beauticianType;

    @ApiModelProperty("订单编号")
    private String orderNo;

    @ApiModelProperty("交易类型(1-服务订单提成,2-提现,3-退款)")
    private Integer tradeType;

    @ApiModelProperty("服务名称")
    private String productName;

    @ApiModelProperty("产品价格")
    private Integer productPrice;

    @ApiModelProperty("产品数量")
    private Integer productNumber;

    @ApiModelProperty("平台服务费")
    private Integer platformAmount;

    @ApiModelProperty("门店提成")
    private Integer storeAmoun;

    @ApiModelProperty("付款时间")
    private Date payTime;

    @ApiModelProperty("交易状态:0-未完成,1-已完成")
    private Integer tradeStatus;

    @ApiModelProperty("服务提成")
    private Integer income;

    @ApiModelProperty("上门费用")
    private Integer visitAmount;

    @ApiModelProperty("净收入")
    private Integer netIncome;

    @ApiModelProperty("支付方式")
    private Integer payMethod;

    @ApiModelProperty("支付比率")
    private Integer payRate;

    @ApiModelProperty("结算时间")
    private Date settlementTime;

    @ApiModelProperty("退款金额")
    private Integer reimburseAmount;

    @ApiModelProperty("退款时间")
    private Date reimburseTime;

    @ApiModelProperty("提现申请金额")
    private Integer withdrawAmount;

    @ApiModelProperty("提现手续费")
    private Integer taxation;

    @ApiModelProperty("'实际提现金额(扣除手续费后)',")
    private Integer actualAmount;

    private String bankName;

    @ApiModelProperty("银行支行")
    private String bankBranch;

    @ApiModelProperty("会员银行卡号码")
    private String bankCardNo;

    @ApiModelProperty("提现申请时间")
    private Date addTime;

    @ApiModelProperty("预打款时间")
    private Date readyPlayAmountTime;

    @ApiModelProperty("打款时间")
    private Date playAmountTime;

    @ApiModelProperty("打款状态(0：未打款，1：已打款)")
    private Byte playAmountStatus;

    @ApiModelProperty("统计时间年份")
    private String statisticsYear;

    @ApiModelProperty("统计时间年份月份")
    private String statisticsYearMonth;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("备注")
    private String remarks;

    @ApiModelProperty("查询类型 0-收益流水 1-待结算收益流水")
    private Integer findType;

    @ApiModelProperty("实际支付金额")
    private Integer amountPay;

    @ApiModelProperty("店铺流水类型 0-挂靠店铺流水，1-店铺流水 ")
    private Integer subordinateStatus;


}


