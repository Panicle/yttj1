package com.zjw.yttj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjw.yttj.entity.YttjUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 类目
 * Created by Panicle
 * 2020/3/2 18:22
 **/
public interface YttjUserService extends IService<YttjUser> {
    /*1.添加个人信息*/
    String  insertOne(YttjUser yttjUser);
    /*2.查询单个职工信息*/
    YttjUser selectById(int id);
    /*3.查询全部用户*/
    Page<YttjUser> findList(int id, Pageable pageable);
    /*4.删除单个用户*/
    YttjUser deleteOne(YttjUser yttjUser);

}
