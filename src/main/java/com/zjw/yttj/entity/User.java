package com.zjw.yttj.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 类目
 * Created by Panicle
 * 2020/2/7 19:04
 **/
@Data
@TableName("user")
@EqualsAndHashCode(callSuper = false)
public class User extends Model<User> {
    private static final long serialVersion=1L;
    @TableId(value = "id")
    private Integer id;
    @TableField("user_name")
    private String userName;
    private String password;
    private Integer age;
    //@TableField(exist = false)
}
