package com.zjw.yttj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类目
 * Created by Panicle
 * 2020/2/23 18:07
 **/
@Controller
public class form1Controller {
    @RequestMapping(value = "/form1")
    public String toform1(){
        return"form1";
    }
}
