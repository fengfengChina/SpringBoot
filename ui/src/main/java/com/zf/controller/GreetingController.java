package com.zf.controller;

import com.zf.domain.User;
//import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.concurrent.atomic.AtomicLong;

/**
 * GreetingController
 *
 * @author zf
 * @date 16/6/14
 */
@RestController
public class GreetingController {


    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting",method = RequestMethod.POST)
    public String greeting( Principal user) {
        return  ((User)user).getUserName();
    }

}
