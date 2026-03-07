package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanshifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanshifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshifenleiView;


/**
 * 实验室分类
 *
 * @author 
 * @email 
 * @date 2022-01-29 14:15:41
 */
public interface ShiyanshifenleiService extends IService<ShiyanshifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshifenleiVO> selectListVO(Wrapper<ShiyanshifenleiEntity> wrapper);
   	
   	ShiyanshifenleiVO selectVO(@Param("ew") Wrapper<ShiyanshifenleiEntity> wrapper);
   	
   	List<ShiyanshifenleiView> selectListView(Wrapper<ShiyanshifenleiEntity> wrapper);
   	
   	ShiyanshifenleiView selectView(@Param("ew") Wrapper<ShiyanshifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanshifenleiEntity> wrapper);
   	

}

