package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WenzhangbiaoqianEntity;
import com.entity.view.WenzhangbiaoqianView;

import com.service.WenzhangbiaoqianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 文章标签
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-02 12:53:28
 */
@RestController
@RequestMapping("/wenzhangbiaoqian")
public class WenzhangbiaoqianController {
    @Autowired
    private WenzhangbiaoqianService wenzhangbiaoqianService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenzhangbiaoqianEntity wenzhangbiaoqian,
		HttpServletRequest request){
        EntityWrapper<WenzhangbiaoqianEntity> ew = new EntityWrapper<WenzhangbiaoqianEntity>();

		PageUtils page = wenzhangbiaoqianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhangbiaoqian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenzhangbiaoqianEntity wenzhangbiaoqian, 
		HttpServletRequest request){
        EntityWrapper<WenzhangbiaoqianEntity> ew = new EntityWrapper<WenzhangbiaoqianEntity>();

		PageUtils page = wenzhangbiaoqianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhangbiaoqian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenzhangbiaoqianEntity wenzhangbiaoqian){
       	EntityWrapper<WenzhangbiaoqianEntity> ew = new EntityWrapper<WenzhangbiaoqianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenzhangbiaoqian, "wenzhangbiaoqian")); 
        return R.ok().put("data", wenzhangbiaoqianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenzhangbiaoqianEntity wenzhangbiaoqian){
        EntityWrapper< WenzhangbiaoqianEntity> ew = new EntityWrapper< WenzhangbiaoqianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenzhangbiaoqian, "wenzhangbiaoqian")); 
		WenzhangbiaoqianView wenzhangbiaoqianView =  wenzhangbiaoqianService.selectView(ew);
		return R.ok("查询文章标签成功").put("data", wenzhangbiaoqianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenzhangbiaoqianEntity wenzhangbiaoqian = wenzhangbiaoqianService.selectById(id);
        return R.ok().put("data", wenzhangbiaoqian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenzhangbiaoqianEntity wenzhangbiaoqian = wenzhangbiaoqianService.selectById(id);
        return R.ok().put("data", wenzhangbiaoqian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenzhangbiaoqianEntity wenzhangbiaoqian, HttpServletRequest request){
    	wenzhangbiaoqian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenzhangbiaoqian);
        wenzhangbiaoqianService.insert(wenzhangbiaoqian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenzhangbiaoqianEntity wenzhangbiaoqian, HttpServletRequest request){
    	wenzhangbiaoqian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenzhangbiaoqian);
        wenzhangbiaoqianService.insert(wenzhangbiaoqian);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WenzhangbiaoqianEntity wenzhangbiaoqian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenzhangbiaoqian);
        wenzhangbiaoqianService.updateById(wenzhangbiaoqian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenzhangbiaoqianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
