package com.union.aimei.umeng.controller;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.model.umeng.BaseUmengPushHistory;
import com.union.aimei.common.vo.umeng.UmengPushCategory;
import com.union.aimei.umeng.service.BaseUmengPushHistoryService;
import com.union.common.utils.ResponseMessage;
import com.union.common.utils.exception.ClientException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author houji
 * @date 2018/8/13  11:46
 */
@Api(tags="友盟消息推送记录")
@RestController
@RequestMapping(value="baseUmengPushHistory")
public class BaseUmengPushHistoryController {
       @Resource
       private BaseUmengPushHistoryService baseUmengPushHistoryService;

       @PostMapping("/front/findByPage")
       public PageInfo<BaseUmengPushHistory> findByPageForFront(@ApiParam(value="分页索引",defaultValue="0")  @RequestParam(defaultValue="0")
	 Integer pageNo, @ApiParam(value="每页数量",defaultValue="10")  @RequestParam(defaultValue="10")
	 Integer pageSize, @ApiParam(value="查询条件") @RequestBody BaseUmengPushHistory baseUmengPushHistory) {
              return this.baseUmengPushHistoryService.findByPageForFront(pageNo,pageSize,baseUmengPushHistory);
       }

       @PostMapping("/insert")
       public int insert(@RequestBody BaseUmengPushHistory baseUmengPushHistory) {
              return this.baseUmengPushHistoryService.addObj(baseUmengPushHistory);
       }

       @DeleteMapping("/deleteById/{id}")
       public int deleteById(@PathVariable (value="id") int id) {
              return this.baseUmengPushHistoryService.deleteObjById(id);
       }

       @PutMapping("/edit")
       public int edit(@RequestBody BaseUmengPushHistory baseUmengPushHistory) {
              return this.baseUmengPushHistoryService.modifyObj(baseUmengPushHistory);
       }

       @GetMapping("/queryById/{id}")
       public BaseUmengPushHistory queryById(@PathVariable (value="id") int id) {
              return this.baseUmengPushHistoryService.queryObjById(id);
       }

       @PostMapping("/front/findCategoryList")
       public ResponseMessage findCategoryList(@RequestBody UmengPushCategory umengPushCategory) {
              Optional.of(umengPushCategory)
                      .filter(m1->m1.getMemberId() !=null)
                      .orElseThrow(()->new ClientException(500,"用户未登录，数据请求错误"));
              return this.baseUmengPushHistoryService.findCategoryList(umengPushCategory);
       }

}