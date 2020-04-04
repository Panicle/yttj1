package com.zjw.yttj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类目
 * Created by Panicle
 * 2020/2/23 18:10
 **/
@Controller
public class form2Controller {
    @RequestMapping(value = "/form2")
    public String toform2(){
        return"form2";
    }
}
