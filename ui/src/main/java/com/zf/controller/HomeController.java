package com.zf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 *
 * @author zf
 * @date 16/6/14
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

}