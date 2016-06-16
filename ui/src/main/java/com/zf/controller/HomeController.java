package com.zf.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 *
 * @author zf
 * @date 16/6/14
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/",method =  RequestMethod.POST)
    @ApiOperation(value="测试服务是否异常接口", notes="查看服务")
    public String home() {
        return "哈哈哈!你能正常访问了.";
    }

}