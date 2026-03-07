package com.entity.model;

import com.entity.YuanxiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 院校信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-01-29 14:15:41
 */
public class YuanxiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiashijian;
				
	
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
