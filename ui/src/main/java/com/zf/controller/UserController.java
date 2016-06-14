package com.zf.controller;

import com.zf.domain.User;
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
    public String getUsers() {
        return "1233333333";
    }

}
