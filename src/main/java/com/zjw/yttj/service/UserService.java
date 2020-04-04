package com.zjw.yttj.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zjw.yttj.entity.User;

/**
 * 类目
 * Created by Panicle
 * 2020/2/7 19:24
 **/
public interface UserService extends IService<User> {
    User selectById(int id);
}
