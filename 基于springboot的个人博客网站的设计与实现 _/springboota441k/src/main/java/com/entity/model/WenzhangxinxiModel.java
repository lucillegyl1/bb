package com.entity.model;

import com.entity.WenzhangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 文章信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-02 12:53:28
 */
public class WenzhangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文章名称
	 */
	
	private String wenzhangmingcheng;
		
	/**
	 * 文章分类
	 */
	
	private String wenzhangfenlei;
		
	/**
	 * 文章标签
	 */
	
	private String wenzhangbiaoqian;
		
	/**
	 * 文章图片
	 */
	
	private String wenzhangtupian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 文章内容
	 */
	
	private String wenzhangneirong;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：文章名称
	 */
	 
	public void setWenzhangmingcheng(String wenzhangmingcheng) {
		this.wenzhangmingcheng = wenzhangmingcheng;
	}
	
	/**
	 * 获取：文章名称
	 */
	public String getWenzhangmingcheng() {
		return wenzhangmingcheng;
	}
				
	
	/**
	 * 设置：文章分类
	 */
	 
	public void setWenzhangfenlei(String wenzhangfenlei) {
		this.wenzhangfenlei = wenzhangfenlei;
	}
	
	/**
	 * 获取：文章分类
	 */
	public String getWenzhangfenlei() {
		return wenzhangfenlei;
	}
				
	
	/**
	 * 设置：文章标签
	 */
	 
	public void setWenzhangbiaoqian(String wenzhangbiaoqian) {
		this.wenzhangbiaoqian = wenzhangbiaoqian;
	}
	
	/**
	 * 获取：文章标签
	 */
	public String getWenzhangbiaoqian() {
		return wenzhangbiaoqian;
	}
				
	
	/**
	 * 设置：文章图片
	 */
	 
	public void setWenzhangtupian(String wenzhangtupian) {
		this.wenzhangtupian = wenzhangtupian;
	}
	
	/**
	 * 获取：文章图片
	 */
	public String getWenzhangtupian() {
		return wenzhangtupian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：文章内容
	 */
	 
	public void setWenzhangneirong(String wenzhangneirong) {
		this.wenzhangneirong = wenzhangneirong;
	}
	
	/**
	 * 获取：文章内容
	 */
	public String getWenzhangneirong() {
		return wenzhangneirong;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
