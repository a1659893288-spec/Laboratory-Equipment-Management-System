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
 * 实验室
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-01-29 14:15:41
 */
@TableName("shiyanshi")
public class ShiyanshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiyanshiEntity() {
		
	}
	
	public ShiyanshiEntity(T t) {
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
	 * 实验室编号
	 */
					
	private String shiyanshibianhao;
	
	/**
	 * 实验室名称
	 */
					
	private String shiyanshimingcheng;
	
	/**
	 * 实验室规模
	 */
					
	private String shiyanshiguimo;
	
	/**
	 * 实验室分类
	 */
					
	private String shiyanshifenlei;
	
	/**
	 * 实验室图片
	 */
					
	private String shiyanshitupian;
	
	/**
	 * 实验室位置
	 */
					
	private String shiyanshiweizhi;
	
	/**
	 * 实验室状态
	 */
					
	private String shiyanshizhuangtai;
	
	/**
	 * 实验室设备
	 */
					
	private String shiyanshishebei;
	
	/**
	 * 可约时间
	 */
					
	private String keyueshijian;
	
	/**
	 * 实验室情况
	 */
					
	private String shiyanshiqingkuang;
	
	
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
	 * 设置：实验室编号
	 */
	public void setShiyanshibianhao(String shiyanshibianhao) {
		this.shiyanshibianhao = shiyanshibianhao;
	}
	/**
	 * 获取：实验室编号
	 */
	public String getShiyanshibianhao() {
		return shiyanshibianhao;
	}
	/**
	 * 设置：实验室名称
	 */
	public void setShiyanshimingcheng(String shiyanshimingcheng) {
		this.shiyanshimingcheng = shiyanshimingcheng;
	}
	/**
	 * 获取：实验室名称
	 */
	public String getShiyanshimingcheng() {
		return shiyanshimingcheng;
	}
	/**
	 * 设置：实验室规模
	 */
	public void setShiyanshiguimo(String shiyanshiguimo) {
		this.shiyanshiguimo = shiyanshiguimo;
	}
	/**
	 * 获取：实验室规模
	 */
	public String getShiyanshiguimo() {
		return shiyanshiguimo;
	}
	/**
	 * 设置：实验室分类
	 */
	public void setShiyanshifenlei(String shiyanshifenlei) {
		this.shiyanshifenlei = shiyanshifenlei;
	}
	/**
	 * 获取：实验室分类
	 */
	public String getShiyanshifenlei() {
		return shiyanshifenlei;
	}
	/**
	 * 设置：实验室图片
	 */
	public void setShiyanshitupian(String shiyanshitupian) {
		this.shiyanshitupian = shiyanshitupian;
	}
	/**
	 * 获取：实验室图片
	 */
	public String getShiyanshitupian() {
		return shiyanshitupian;
	}
	/**
	 * 设置：实验室位置
	 */
	public void setShiyanshiweizhi(String shiyanshiweizhi) {
		this.shiyanshiweizhi = shiyanshiweizhi;
	}
	/**
	 * 获取：实验室位置
	 */
	public String getShiyanshiweizhi() {
		return shiyanshiweizhi;
	}
	/**
	 * 设置：实验室状态
	 */
	public void setShiyanshizhuangtai(String shiyanshizhuangtai) {
		this.shiyanshizhuangtai = shiyanshizhuangtai;
	}
	/**
	 * 获取：实验室状态
	 */
	public String getShiyanshizhuangtai() {
		return shiyanshizhuangtai;
	}
	/**
	 * 设置：实验室设备
	 */
	public void setShiyanshishebei(String shiyanshishebei) {
		this.shiyanshishebei = shiyanshishebei;
	}
	/**
	 * 获取：实验室设备
	 */
	public String getShiyanshishebei() {
		return shiyanshishebei;
	}
	/**
	 * 设置：可约时间
	 */
	public void setKeyueshijian(String keyueshijian) {
		this.keyueshijian = keyueshijian;
	}
	/**
	 * 获取：可约时间
	 */
	public String getKeyueshijian() {
		return keyueshijian;
	}
	/**
	 * 设置：实验室情况
	 */
	public void setShiyanshiqingkuang(String shiyanshiqingkuang) {
		this.shiyanshiqingkuang = shiyanshiqingkuang;
	}
	/**
	 * 获取：实验室情况
	 */
	public String getShiyanshiqingkuang() {
		return shiyanshiqingkuang;
	}

}
