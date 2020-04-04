package com.zjw.yttj.controller;

import com.zjw.yttj.service.YttjUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类目
 * Created by Panicle
 * 2020/3/2 19:24
 **/
@RestController
@RequestMapping("yttj/yttjuser")
public class YttjUserController {
    @Autowired
    private YttjUserService yttjUserService;
}
