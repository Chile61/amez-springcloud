package com.union.aimei.common.vo.im.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Msg;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 地址位置消息
 *
 * @author liurenkai
 * @time 2018/1/8 20:06
 */
@Data
@EqualsAndHashCode
@ApiModel(value = "地址位置消息")
public class MsgLoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "消息")
    private Msg msg;
    @ApiModelProperty(value = "地址位置消息内容")
    private MsgContentLoc msgContentLoc;
}
