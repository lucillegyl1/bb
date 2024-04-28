package com.entity.view;

import com.entity.WenzhangbiaoqianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文章标签
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-02 12:53:28
 */
@TableName("wenzhangbiaoqian")
public class WenzhangbiaoqianView  extends WenzhangbiaoqianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhangbiaoqianView(){
	}
 
 	public WenzhangbiaoqianView(WenzhangbiaoqianEntity wenzhangbiaoqianEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhangbiaoqianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
