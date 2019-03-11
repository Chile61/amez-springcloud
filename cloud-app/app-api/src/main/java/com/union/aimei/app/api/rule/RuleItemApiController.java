package com.union.aimei.app.api.rule;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.model.rule.RuleItem;
import com.union.aimei.common.feign.app.rule.RuleItemFeign;
import com.union.common.utils.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 规则项
 *
 * @author liurenkai
 * @time 2018/5/10 17:35
 */
@Api(tags = "规则项")
@RestController
@RequestMapping(value = "ruleItem")
public class RuleItemApiController {
    @Resource
    private RuleItemFeign ruleItemFeign;

    /**
     * 分页查询规则项
     *
     * @param pageNo   分页索引
     * @param pageSize 每页数量
     * @param ruleItem 查询条件
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "分页查询规则项")
    @PostMapping("/front/findByPage")
    public ResponseMessage<PageInfo<RuleItem>> findByPageForFront(@ApiParam(value = "分页索引", defaultValue = "0") @RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo,
                                                                  @ApiParam(value = "每页数量", defaultValue = "10") @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                                  @ApiParam(value = "查询条件") @RequestBody RuleItem ruleItem) {
        return this.ruleItemFeign.findByPageForFront(pageNo, pageSize, ruleItem);
    }

}