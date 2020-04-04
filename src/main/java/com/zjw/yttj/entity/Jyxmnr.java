package com.zjw.yttj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

/**
 * 
 * 
 * @author panicle
 * @email sunlightcs@gmail.com
 * @date 2020-01-16 21:34:34
 */
@Data
@TableName("jyxmnr")
public class Jyxmnr extends Model<Jyxmnr> {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(value = "jyxmnr_id")
	private Integer jyxmnrId;
	/**
	 * 
	 */
	private String jyxmnrName;
	/**
	 * 
	 */
	private Integer jyxmflId;
	/**
	 * 
	 */
	private Date createtime;
	/**
	 * 
	 */
	private Date updatetime;

}
