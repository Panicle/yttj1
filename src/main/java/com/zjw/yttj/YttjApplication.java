package com.zjw.yttj;

import com.zjw.yttj.config.WeixinConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("com.zjw.yttj.dao")
public class YttjApplication {

    public static void main(String[] args) {
        SpringApplication.run(YttjApplication.class, args);
    }
    @Autowired
    WeixinConfig weixinConfig;

    @GetMapping("/test")
    public String test(){
        return weixinConfig.toString();
    }
}
