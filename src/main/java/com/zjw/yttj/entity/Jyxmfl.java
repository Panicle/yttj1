package com.zjw.yttj.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

/**
 * 
 * 检验项目大分类
 * @author panicle
 * @email sunlightcs@gmail.com
 * @date 2020-01-16 21:34:34
 */
@Data
@TableName("jyxmfl")
public class Jyxmfl extends Model<Jyxmfl> {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(value = "jyxmfl_id")
	private Integer jyxmflId;
	/**
	 * 
	 */
	private String jyxmflName;
	/**
	 * 
	 */
	private Date createtime;
	/**
	 * 
	 */
	private Date updatetime;

}
