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

import com.entity.DiscusswenzhangxinxiEntity;
import com.entity.view.DiscusswenzhangxinxiView;

import com.service.DiscusswenzhangxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 文章信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-02 12:53:28
 */
@RestController
@RequestMapping("/discusswenzhangxinxi")
public class DiscusswenzhangxinxiController {
    @Autowired
    private DiscusswenzhangxinxiService discusswenzhangxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusswenzhangxinxiEntity discusswenzhangxinxi,
		HttpServletRequest request){
        EntityWrapper<DiscusswenzhangxinxiEntity> ew = new EntityWrapper<DiscusswenzhangxinxiEntity>();

		PageUtils page = discusswenzhangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusswenzhangxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusswenzhangxinxiEntity discusswenzhangxinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscusswenzhangxinxiEntity> ew = new EntityWrapper<DiscusswenzhangxinxiEntity>();

		PageUtils page = discusswenzhangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusswenzhangxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusswenzhangxinxiEntity discusswenzhangxinxi){
       	EntityWrapper<DiscusswenzhangxinxiEntity> ew = new EntityWrapper<DiscusswenzhangxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusswenzhangxinxi, "discusswenzhangxinxi")); 
        return R.ok().put("data", discusswenzhangxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusswenzhangxinxiEntity discusswenzhangxinxi){
        EntityWrapper< DiscusswenzhangxinxiEntity> ew = new EntityWrapper< DiscusswenzhangxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusswenzhangxinxi, "discusswenzhangxinxi")); 
		DiscusswenzhangxinxiView discusswenzhangxinxiView =  discusswenzhangxinxiService.selectView(ew);
		return R.ok("查询文章信息评论表成功").put("data", discusswenzhangxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusswenzhangxinxiEntity discusswenzhangxinxi = discusswenzhangxinxiService.selectById(id);
        return R.ok().put("data", discusswenzhangxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusswenzhangxinxiEntity discusswenzhangxinxi = discusswenzhangxinxiService.selectById(id);
        return R.ok().put("data", discusswenzhangxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusswenzhangxinxiEntity discusswenzhangxinxi, HttpServletRequest request){
    	discusswenzhangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusswenzhangxinxi);
        discusswenzhangxinxiService.insert(discusswenzhangxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusswenzhangxinxiEntity discusswenzhangxinxi, HttpServletRequest request){
    	discusswenzhangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusswenzhangxinxi);
        discusswenzhangxinxiService.insert(discusswenzhangxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscusswenzhangxinxiEntity discusswenzhangxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusswenzhangxinxi);
        discusswenzhangxinxiService.updateById(discusswenzhangxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusswenzhangxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
