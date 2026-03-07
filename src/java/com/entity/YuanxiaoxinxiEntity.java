package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 院校信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-01-29 14:15:41
 */
@TableName("yuanxiaoxinxi")
public class YuanxiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuanxiaoxinxiEntity() {
		
	}
	
	public YuanxiaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 院校名称
	 */
					
	private String yuanxiaomingcheng;
	
	/**
	 * 院校类型
	 */
					
	private String yuanxiaoleixing;
	
	/**
	 * 院校性质
	 */
					
	private String yuanxiaoxingzhi;
	
	/**
	 * 院校隶属
	 */
					
	private String yuanxiaolishu;
	
	/**
	 * 院校所在地
	 */
					
	private String yuanxiaosuozaidi;
	
	/**
	 * 院校网址
	 */
					
	private String yuanxiaowangzhi;
	
	/**
	 * 院校照片
	 */
					
	private String yuanxiaozhaopian;
	
	/**
	 * 添加时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tianjiashijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：院校名称
	 */
	public void setYuanxiaomingcheng(String yuanxiaomingcheng) {
		this.yuanxiaomingcheng = yuanxiaomingcheng;
	}
	/**
	 * 获取：院校名称
	 */
	public String getYuanxiaomingcheng() {
		return yuanxiaomingcheng;
	}
	/**
	 * 设置：院校类型
	 */
	public void setYuanxiaoleixing(String yuanxiaoleixing) {
		this.yuanxiaoleixing = yuanxiaoleixing;
	}
	/**
	 * 获取：院校类型
	 */
	public String getYuanxiaoleixing() {
		return yuanxiaoleixing;
	}
	/**
	 * 设置：院校性质
	 */
	public void setYuanxiaoxingzhi(String yuanxiaoxingzhi) {
		this.yuanxiaoxingzhi = yuanxiaoxingzhi;
	}
	/**
	 * 获取：院校性质
	 */
	public String getYuanxiaoxingzhi() {
		return yuanxiaoxingzhi;
	}
	/**
	 * 设置：院校隶属
	 */
	public void setYuanxiaolishu(String yuanxiaolishu) {
		this.yuanxiaolishu = yuanxiaolishu;
	}
	/**
	 * 获取：院校隶属
	 */
	public String getYuanxiaolishu() {
		return yuanxiaolishu;
	}
	/**
	 * 设置：院校所在地
	 */
	public void setYuanxiaosuozaidi(String yuanxiaosuozaidi) {
		this.yuanxiaosuozaidi = yuanxiaosuozaidi;
	}
	/**
	 * 获取：院校所在地
	 */
	public String getYuanxiaosuozaidi() {
		return yuanxiaosuozaidi;
	}
	/**
	 * 设置：院校网址
	 */
	public void setYuanxiaowangzhi(String yuanxiaowangzhi) {
		this.yuanxiaowangzhi = yuanxiaowangzhi;
	}
	/**
	 * 获取：院校网址
	 */
	public String getYuanxiaowangzhi() {
		return yuanxiaowangzhi;
	}
	/**
	 * 设置：院校照片
	 */
	public void setYuanxiaozhaopian(String yuanxiaozhaopian) {
		this.yuanxiaozhaopian = yuanxiaozhaopian;
	}
	/**
	 * 获取：院校照片
	 */
	public String getYuanxiaozhaopian() {
		return yuanxiaozhaopian;
	}
	/**
	 * 设置：添加时间
	 */
	public void setTianjiashijian(Date tianjiashijian) {
		this.tianjiashijian = tianjiashijian;
	}
	/**
	 * 获取：添加时间
	 */
	public Date getTianjiashijian() {
		return tianjiashijian;
	}

}
