package com.dao;

import com.entity.ShiyanshifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanshifenleiVO;
import com.entity.view.ShiyanshifenleiView;


/**
 * 实验室分类
 * 
 * @author 
 * @email 
 * @date 2022-01-29 14:15:41
 */
public interface ShiyanshifenleiDao extends BaseMapper<ShiyanshifenleiEntity> {
	
	List<ShiyanshifenleiVO> selectListVO(@Param("ew") Wrapper<ShiyanshifenleiEntity> wrapper);
	
	ShiyanshifenleiVO selectVO(@Param("ew") Wrapper<ShiyanshifenleiEntity> wrapper);
	
	List<ShiyanshifenleiView> selectListView(@Param("ew") Wrapper<ShiyanshifenleiEntity> wrapper);

	List<ShiyanshifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanshifenleiEntity> wrapper);
	
	ShiyanshifenleiView selectView(@Param("ew") Wrapper<ShiyanshifenleiEntity> wrapper);
	

}
