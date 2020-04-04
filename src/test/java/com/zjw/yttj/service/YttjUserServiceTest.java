package com.zjw.yttj.service;

import com.zjw.yttj.entity.YttjUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 类目
 * Created by Panicle
 * 2020/3/2 18:33
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class YttjUserServiceTest {
    @Autowired
    YttjUserService yttjUserService;

    @Test
    public void selectById() {
        System.out.println(yttjUserService.selectById(1));
    }
    @Test
    public void insertOne(){
        YttjUser yttjUser=new YttjUser();
        yttjUser.setUserId(2);
        yttjUser.setUsername("1233");
        yttjUser.setPassword("1234");
        yttjUser.setName("panicle");
        yttjUser.setGender(1);
        yttjUser.setAge(18);
        yttjUser.setAdress("烟台");
        yttjUser.setTel(1234567890);
        System.out.println(yttjUser);
        String re=yttjUserService.insertOne(yttjUser);
        System.out.println(re);
    }
}