package com.ftd.controller;


import com.ftd.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @描述: .
 * @作者: ZHaoWeiNan .
 * @创建时间: 2016/8/29 .
 * @版本: 1.0 .
 */
@RestController
public class GreetingController {

    @RequestMapping(value = "user")
    public User view() {
        User user = new User();
        user.setId(1L);
        user.setName("Hello World!");
        return user;
    }

}
