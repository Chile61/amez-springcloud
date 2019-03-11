package com.union.aimei.common.vo.store.app;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 店铺美容师账户余额
 *
 * @author liurenkai
 * @time 2018/3/8 17:35
 */
@Data
@EqualsAndHashCode
@ApiModel("店铺账户余额")
public class StoreBeaByAccountBalanceVo implements Serializable {

    @ApiModelProperty("店铺ID")
    private Integer id;

    @ApiModelProperty("账户余额")
    private Integer accountBalance;

}
