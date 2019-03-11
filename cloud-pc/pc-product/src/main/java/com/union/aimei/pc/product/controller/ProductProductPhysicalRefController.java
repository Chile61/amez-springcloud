package com.union.aimei.pc.product.controller;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.model.product.ProductProductPhysicalRef;
import com.union.aimei.pc.product.service.ProductProductPhysicalRefService;
import com.union.aimei.common.vo.product.pc.ProductProductPhysicalRefByBatchVo;
import com.union.common.utils.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 项目-产品-关联
 *
 * @author liurenkai
 * @time 2018/2/28 16:07
 */
@Api(tags = "项目-产品-关联")
@RestController
@RequestMapping(value = "productProductPhysicalRef")
public class ProductProductPhysicalRefController {
    @Resource
    private ProductProductPhysicalRefService productProductPhysicalRefService;

    @PostMapping("/front/findByPage")
    public PageInfo<ProductProductPhysicalRef> findByPageForFront(@ApiParam(value = "分页索引", defaultValue = "0") @RequestParam(defaultValue = "0")
                                                                          Integer pageNo, @ApiParam(value = "每页数量", defaultValue = "10") @RequestParam(defaultValue = "10")
                                                                          Integer pageSize, @ApiParam(value = "查询条件") @RequestBody ProductProductPhysicalRef productProductPhysicalRef) {
        return this.productProductPhysicalRefService.findByPageForFront(pageNo, pageSize, productProductPhysicalRef);
    }

    @PostMapping("/insert")
    public int insert(@RequestBody ProductProductPhysicalRef productProductPhysicalRef) {
        return this.productProductPhysicalRefService.addObj(productProductPhysicalRef);
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable(value = "id") int id) {
        return this.productProductPhysicalRefService.deleteObjById(id);
    }

    @PutMapping("/edit")
    public int edit(@RequestBody ProductProductPhysicalRef productProductPhysicalRef) {
        return this.productProductPhysicalRefService.modifyObj(productProductPhysicalRef);
    }

    @GetMapping("/queryById/{id}")
    public ProductProductPhysicalRef queryById(@PathVariable(value = "id") int id) {
        return this.productProductPhysicalRefService.queryObjById(id);
    }

    /**
     * 根据商品ID删除项目-产品-关联
     *
     * @param productId 商品ID
     * @return
     */
    @ApiOperation(httpMethod = "DELETE", value = "根据商品ID删除项目-产品-关联")
    @DeleteMapping("/deleteByProductId/{productId}")
    public ResponseMessage deleteByProductId(@PathVariable(value = "productId") int productId) {
        return this.productProductPhysicalRefService.deleteByProductId(productId);
    }


    /**
     * 批量添加项目-产品-关联
     *
     * @param productProductPhysicalRefByBatchVo
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "批量添加项目-产品-关联")
    @PostMapping("/addBatch")
    public ResponseMessage addBatch(@ApiParam(value = "批量项目-产品-关联") @RequestBody ProductProductPhysicalRefByBatchVo productProductPhysicalRefByBatchVo) {
        return this.productProductPhysicalRefService.addBatch(productProductPhysicalRefByBatchVo);
    }

    /**
     * 保存项目-产品-关联
     *
     * @param productProductPhysicalRef 项目-产品-关联
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "保存项目-产品-关联")
    @PostMapping("/save")
    public ResponseMessage save(@ApiParam(value = "项目-产品-关联") @RequestBody ProductProductPhysicalRef productProductPhysicalRef) {
        return this.productProductPhysicalRefService.save(productProductPhysicalRef);
    }

}