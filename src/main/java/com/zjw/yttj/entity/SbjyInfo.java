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
@TableName("sbjy_info")
public class SbjyInfo extends Model<SbjyInfo> {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(value = "sb_id")
	private Integer sbId;
	/**
	 * 
	 */
	private Integer sbzlId;
	/**
	 * 
	 */
	private Integer sblbId;
	/**
	 * 
	 */
	private Integer sbpzId;
	/**
	 * 
	 */
	private Integer jylbId;
	/**
	 * 
	 */
	private Date jyrq;
	/**
	 * 使用单位
	 */
	private String sydw;
	/**
	 * 安装地址
	 */
	private String azdz;
	/**
	 * 维保单位
	 */
	private String wbdw;
	/**
	 * 
	 */
	private Integer jyxmlbId;
	/**
	 * 
	 */
	private Integer jyxmflId;
	/**
	 * 
	 */
	private Integer jyxmnrId;
	/**
	 * 
	 */
	private Integer jyxmnrmxId;
	/**
	 * 
	 */
	private String jyxmwt;
	/**
	 * 
	 */
	private String nbbh;
	/**
	 * 检验人
	 */
	private Integer userId;
	/**
	 * 
	 */
	private Date createtime;
	/**
	 * 
	 */
	private Date updatetime;

}
