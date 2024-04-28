package com.dao;

import com.entity.WenzhangbiaoqianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhangbiaoqianVO;
import com.entity.view.WenzhangbiaoqianView;


/**
 * 文章标签
 * 
 * @author 
 * @email 
 * @date 2023-05-02 12:53:28
 */
public interface WenzhangbiaoqianDao extends BaseMapper<WenzhangbiaoqianEntity> {
	
	List<WenzhangbiaoqianVO> selectListVO(@Param("ew") Wrapper<WenzhangbiaoqianEntity> wrapper);
	
	WenzhangbiaoqianVO selectVO(@Param("ew") Wrapper<WenzhangbiaoqianEntity> wrapper);
	
	List<WenzhangbiaoqianView> selectListView(@Param("ew") Wrapper<WenzhangbiaoqianEntity> wrapper);

	List<WenzhangbiaoqianView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhangbiaoqianEntity> wrapper);
	
	WenzhangbiaoqianView selectView(@Param("ew") Wrapper<WenzhangbiaoqianEntity> wrapper);
	

}
