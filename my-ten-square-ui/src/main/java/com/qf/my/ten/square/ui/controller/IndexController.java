package com.qf.my.ten.square.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaowang
 * @date 2018/12/17 16:49
 */
@Controller
public class IndexController {


    @RequestMapping(value = "")
    public String index(){
        return "index";
    }
}
