package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : wjl
 * @date : 14:34 2020/8/19
 * @user : lenovo
 */
@Controller
public class UserController {

    @RequestMapping("/hi")
    public String hi(){
        return "hi zhaoshun,how are you laowang";
    }
}
