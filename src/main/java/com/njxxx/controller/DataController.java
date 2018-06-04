package com.njxxx.controller;

import com.njxxx.common.ResultData;
import com.njxxx.domain.PlmProjectDO;
import com.njxxx.domain.UserDO;
import com.njxxx.sercvices.UserService;
import com.njxxx.service.UService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.util.List;

/**
 * Created by 陈亚兰 on 2018/6/4.
 */
@RestController
@RequestMapping("/oracle")
@Api(description = "oracle")
public class DataController {
    @Autowired
    private UService uService;

    @ApiOperation("得到项目code和登陆人")
    @GetMapping("/user")
    public ResultData<List<UserDO>> getAllPlmAndUser(){
        List<UserDO> getUser=uService.getAll();
        return ResultData.success(getUser);
    }


    @ApiOperation("得到Plm全信息")
    @GetMapping("/plmInfo")
    public ResultData<List<PlmProjectDO>> getPlmDO(){
        List<PlmProjectDO> getProAll=uService.getPlmProjectAll();
        return ResultData.success(getProAll);
    }
}
