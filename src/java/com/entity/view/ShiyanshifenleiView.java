package com.entity.view;

import com.entity.ShiyanshifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验室分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-29 14:15:41
 */
@TableName("shiyanshifenlei")
public class ShiyanshifenleiView  extends ShiyanshifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanshifenleiView(){
	}
 
 	public ShiyanshifenleiView(ShiyanshifenleiEntity shiyanshifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanshifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
