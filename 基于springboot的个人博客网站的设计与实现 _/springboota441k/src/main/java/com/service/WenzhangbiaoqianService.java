package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhangbiaoqianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhangbiaoqianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhangbiaoqianView;


/**
 * 文章标签
 *
 * @author 
 * @email 
 * @date 2023-05-02 12:53:28
 */
public interface WenzhangbiaoqianService extends IService<WenzhangbiaoqianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhangbiaoqianVO> selectListVO(Wrapper<WenzhangbiaoqianEntity> wrapper);
   	
   	WenzhangbiaoqianVO selectVO(@Param("ew") Wrapper<WenzhangbiaoqianEntity> wrapper);
   	
   	List<WenzhangbiaoqianView> selectListView(Wrapper<WenzhangbiaoqianEntity> wrapper);
   	
   	WenzhangbiaoqianView selectView(@Param("ew") Wrapper<WenzhangbiaoqianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhangbiaoqianEntity> wrapper);
   	

}

