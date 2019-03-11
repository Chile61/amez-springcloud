package com.union.aimei.common.model.im;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * IM用户黑名单
 *
 * @author liurenkai
 * @time 2017/11/30 11:04
 */
@Data
@EqualsAndHashCode
@ApiModel(value = "IM用户黑名单")
public class ImUsersBlocks implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("主键ID")
    private Integer id;
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("黑名单用户名")
    private String blockName;
}