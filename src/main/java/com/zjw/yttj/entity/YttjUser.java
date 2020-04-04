package com.zjw.yttj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

/**
 * 用户
 * Created by Panicle
 * 2020/3/2 18:18
 **/
@Data
@TableName("yttj_user")
public class YttjUser extends Model<YttjUser> {
    /**
     * 用户id
     */
    @TableId(value = "user_id")
    private Integer userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 联系电话
     */
    private Integer tel;
    /**
     * 住址
     */
    private String adress;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 更新时间
     */
    private Date updatetime;
}
