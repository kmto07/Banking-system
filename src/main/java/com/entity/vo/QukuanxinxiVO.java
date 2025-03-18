package com.entity.vo;

import com.entity.QukuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 取款信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
public class QukuanxinxiVO  implements Serializable {
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
	 * 取款金额
	 */
	
	private Float yue;
		
	/**
	 * 取款日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qukuanriqi;
		
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
	 * 设置：取款金额
	 */
	 
	public void setYue(Float yue) {
		this.yue = yue;
	}
	
	/**
	 * 获取：取款金额
	 */
	public Float getYue() {
		return yue;
	}
				
	
	/**
	 * 设置：取款日期
	 */
	 
	public void setQukuanriqi(Date qukuanriqi) {
		this.qukuanriqi = qukuanriqi;
	}
	
	/**
	 * 获取：取款日期
	 */
	public Date getQukuanriqi() {
		return qukuanriqi;
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
