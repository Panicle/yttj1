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
@TableName("jyxmnrmx")
public class Jyxmnrmx extends Model<Jyxmnrmx> {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(value = "jyxmnrmx_id")
	private Integer jyxmnrmxId;
	/**
	 * 
	 */
	private String jyxmnrmxName;
	/**
	 * 
	 */
	private Integer jyxmnrId;
	/**
	 * 
	 */
	private Date createtime;
	/**
	 * 
	 */
	private Date updatetime;

}
