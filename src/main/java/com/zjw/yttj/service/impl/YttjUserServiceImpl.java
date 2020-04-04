package com.zjw.yttj.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjw.yttj.dao.YttjUserMapper;
import com.zjw.yttj.entity.YttjUser;
import com.zjw.yttj.service.YttjUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



/**
 * 类目
 * Created by Panicle
 * 2020/3/2 18:40
 **/
@Service
public class YttjUserServiceImpl extends ServiceImpl<YttjUserMapper, YttjUser> implements YttjUserService {
    @Autowired
    private YttjUserMapper yttjUserMapper;

    @Override
    public String insertOne(YttjUser yttjUser) {
        String result;
        if(yttjUserMapper.insert(yttjUser)!=0){
             result="success";
        }else{
             result="false";
        }
        return result;
    }

    @Override
    public YttjUser selectById(int id) {
        YttjUser yttjUser =new YttjUser();
        yttjUser=yttjUserMapper.selectById(id);
        return yttjUser;
    }

    @Override
    public Page<YttjUser> findList(int id, Pageable pageable) {
        return null;
    }



    @Override
    public YttjUser deleteOne(YttjUser yttjUser) {
        return null;
    }
}
