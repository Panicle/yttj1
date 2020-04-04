package com.zjw.yttj.service;

import com.zjw.yttj.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 类目
 * Created by Panicle
 * 2020/2/19 21:46
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void selectById() {
        User user=new User();
        user=userService.selectById(1);
        System.out.println("用户信息："+user);
    }
}