package com.zf.controller;

import com.zf.domain.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author zf
 * @date 16/6/14
 */
@RestController
public class UserController {


    @RequestMapping("/users")
    @ApiOperation(value="用户资料", notes="接口描述")
    public String getUsers() {
        return "1233333333";
    }

}
