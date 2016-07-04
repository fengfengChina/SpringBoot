package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * UserController
 *
 * @author zf
 * @date 16/7/4
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info")
    public String info(Principal principal, ModelMap modelMap){
        String name = principal.getName();
        modelMap.put("name", name);
        return "user/info";
    }
}

