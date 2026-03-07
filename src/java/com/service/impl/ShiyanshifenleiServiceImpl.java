package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShiyanshifenleiDao;
import com.entity.ShiyanshifenleiEntity;
import com.service.ShiyanshifenleiService;
import com.entity.vo.ShiyanshifenleiVO;
import com.entity.view.ShiyanshifenleiView;

@Service("shiyanshifenleiService")
public class ShiyanshifenleiServiceImpl extends ServiceImpl<ShiyanshifenleiDao, ShiyanshifenleiEntity> implements ShiyanshifenleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshifenleiEntity> page = this.selectPage(
                new Query<ShiyanshifenleiEntity>(params).getPage(),
                new EntityWrapper<ShiyanshifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanshifenleiEntity> wrapper) {
		  Page<ShiyanshifenleiView> page =new Query<ShiyanshifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanshifenleiVO> selectListVO(Wrapper<ShiyanshifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshifenleiVO selectVO(Wrapper<ShiyanshifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshifenleiView> selectListView(Wrapper<ShiyanshifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshifenleiView selectView(Wrapper<ShiyanshifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
