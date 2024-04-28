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


import com.dao.WenzhangbiaoqianDao;
import com.entity.WenzhangbiaoqianEntity;
import com.service.WenzhangbiaoqianService;
import com.entity.vo.WenzhangbiaoqianVO;
import com.entity.view.WenzhangbiaoqianView;

@Service("wenzhangbiaoqianService")
public class WenzhangbiaoqianServiceImpl extends ServiceImpl<WenzhangbiaoqianDao, WenzhangbiaoqianEntity> implements WenzhangbiaoqianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhangbiaoqianEntity> page = this.selectPage(
                new Query<WenzhangbiaoqianEntity>(params).getPage(),
                new EntityWrapper<WenzhangbiaoqianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhangbiaoqianEntity> wrapper) {
		  Page<WenzhangbiaoqianView> page =new Query<WenzhangbiaoqianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenzhangbiaoqianVO> selectListVO(Wrapper<WenzhangbiaoqianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhangbiaoqianVO selectVO(Wrapper<WenzhangbiaoqianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhangbiaoqianView> selectListView(Wrapper<WenzhangbiaoqianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhangbiaoqianView selectView(Wrapper<WenzhangbiaoqianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
