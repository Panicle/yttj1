package com.zjw.yttj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

/**
 * 设备种类
 * Created by Panicle
 * 2020/3/2 18:53
 **/
@Data
@TableName("sbzl")
public class Sbzl extends Model<Sbzl> {
    /**
     *
     */
    @TableId(value = "sbzl_id")
    private Integer sbzlId;
    /**
     *
     */
    private String sbzlName;
    /**
     *
     */
    private Date createtime;
    /**
     *
     */
    private Date updatetime;

}
