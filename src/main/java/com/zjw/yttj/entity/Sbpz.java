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
@TableName("sbpz")
public class Sbpz extends Model<Sbpz> {


	/**
	 * 
	 */
	@TableId(value = "sbpz_id")
	private Integer sbpzId;
	/**
	 * 
	 */
	private String sbpzName;
	/**
	 * 
	 */
	private Integer sblbId;
	/**
	 * 
	 */
	private Date createtime;
	/**
	 * 
	 */
	private Date updatetime;

}
