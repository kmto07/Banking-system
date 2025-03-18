package com.entity.model;

import com.entity.CunkuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 存款信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
public class CunkuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 银行名称
	 */
	
	private String yinxingmingcheng;
		
	/**
	 * 卡型
	 */
	
	private String kaxing;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 存款金额
	 */
	
	private Integer yue;
		
	/**
	 * 存款日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date cunkuanriqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
				
	
	/**
	 * 设置：银行名称
	 */
	 
	public void setYinxingmingcheng(String yinxingmingcheng) {
		this.yinxingmingcheng = yinxingmingcheng;
	}
	
	/**
	 * 获取：银行名称
	 */
	public String getYinxingmingcheng() {
		return yinxingmingcheng;
	}
				
	
	/**
	 * 设置：卡型
	 */
	 
	public void setKaxing(String kaxing) {
		this.kaxing = kaxing;
	}
	
	/**
	 * 获取：卡型
	 */
	public String getKaxing() {
		return kaxing;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：存款金额
	 */
	 
	public void setYue(Integer yue) {
		this.yue = yue;
	}
	
	/**
	 * 获取：存款金额
	 */
	public Integer getYue() {
		return yue;
	}
				
	
	/**
	 * 设置：存款日期
	 */
	 
	public void setCunkuanriqi(Date cunkuanriqi) {
		this.cunkuanriqi = cunkuanriqi;
	}
	
	/**
	 * 获取：存款日期
	 */
	public Date getCunkuanriqi() {
		return cunkuanriqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
			
}
