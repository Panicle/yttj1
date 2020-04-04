package com.zjw.yttj.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjw.yttj.dao.UserMapper;
import com.zjw.yttj.entity.User;
import com.zjw.yttj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类目
 * Created by Panicle
 * 2020/2/7 19:25
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectById(int id) {
        User user =new User();
        user=userMapper.selectById(id);
        return user;
    }
}
