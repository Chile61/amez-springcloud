package com.union.aimei.common.vo.im.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Msg;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 视频消息
 *
 * @author liurenkai
 * @time 2018/1/8 20:06
 */
@Data
@EqualsAndHashCode
@ApiModel(value = "视频消息")
public class MsgVideo implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "消息")
    private Msg msg;
    @ApiModelProperty(value = "视频消息内容")
    private MsgContentVideo msgContentVideo;
}
