package com.zjw.yttj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjw.yttj.entity.Sbzl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 
 *
 * @author panicle
 * @email sunlightcs@gmail.com
 * @date 2020-01-16 21:34:34
 */
public interface SbzlService extends IService<Sbzl> {
    /*1.添加单个设备种类*/
    String insertOne(Sbzl sbzl);
    /*2.查询单个设备种类*/
    Sbzl selectById(int id);
    /*3.查询全部设备种类*/
    Page<Sbzl> findList(int id, Pageable pageable);
    /*4.删除单个设备种类*/
    Sbzl deleteOne(Sbzl sbzl);

}

