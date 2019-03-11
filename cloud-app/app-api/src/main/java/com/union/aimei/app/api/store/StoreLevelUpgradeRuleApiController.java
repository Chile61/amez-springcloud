package com.union.aimei.app.api.store;

import com.union.aimei.common.feign.app.store.StoreLevelUpgradeRuleFeign;
import com.union.aimei.common.model.store.StoreLevelUpgradeRule;
import com.union.aimei.common.vo.store.app.StoreLevelUpgradeRuleVo;
import com.union.common.utils.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 店铺成长值规则设置
 *
 * @author liurenkai
 * @time 2017/12/27 16:13
 */
@Api(tags = "店铺成长值规则设置", description = "api")
@RestController
@RequestMapping(value = "storeLevelUpgradeRule")
public class StoreLevelUpgradeRuleApiController {
    @Resource
    private StoreLevelUpgradeRuleFeign storeLevelUpgradeRuleFeign;

    /**
     * 新增店铺成长值规则设置
     *
     * @param storeLevelUpgradeRuleVo 店铺成长值规则设置vo
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "新增店铺成长值规则设置")
    @PostMapping("/add")
    public ResponseMessage add(@RequestBody StoreLevelUpgradeRuleVo storeLevelUpgradeRuleVo) {
        return this.storeLevelUpgradeRuleFeign.add(storeLevelUpgradeRuleVo);
    }

    /**
     * 查询店铺成长值规则设置
     *
     * @return
     */
    @ApiOperation(httpMethod = "GET", value = "查询店铺成长值规则设置")
    @GetMapping("/findList")
    public ResponseMessage<List<StoreLevelUpgradeRule>> findList() {
        return this.storeLevelUpgradeRuleFeign.findList();
    }

}