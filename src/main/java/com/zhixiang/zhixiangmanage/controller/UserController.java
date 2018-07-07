package com.zhixiang.zhixiangmanage.controller;

import com.github.pagehelper.PageInfo;
import com.zhixiang.zhixiangmanage.common.BussinessErrorCode;
import com.zhixiang.zhixiangmanage.common.ResultEntity;
import com.zhixiang.zhixiangmanage.exception.BusinessException;
import com.zhixiang.zhixiangmanage.po.UserInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @项目名：zhixiangmanage
 * @包名：com.zhixiang.zhixiangmanage.controller
 * @作者： 熊鹏
 * @描述：
 * @时间： created in 21:33 2018/6/7
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static Log logger = LogFactory.getLog(UserController.class);


    @ApiOperation(value="查询用户管理", notes="查询用户管理")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize", value = "每页数量", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "offSet", value = "当前页码", required = true, dataType = "String",paramType="query")
    })
    @RequestMapping(method = RequestMethod.GET)
    public ResultEntity<PageInfo<UserInfo>> getIssueList(@RequestParam("pageSize") String pageSize, @RequestParam("offSet") String offSet){
        PageInfo<UserInfo> list= null;
        try {
//            list= service.getIssueList(appId, pageSize, offSet)
        } catch (Exception e) {
            logger.error(String.format("[%s]: error<%s>","=====getResourceSubType=====",e.getMessage()));
            throw new BusinessException(BussinessErrorCode.SYSTEM_ERROR);
        }
        return new ResultEntity(list);
    }



}
