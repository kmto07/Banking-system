package com.entity.view;

import com.entity.KahaozhanghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 卡号账户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
@TableName("kahaozhanghu")
public class KahaozhanghuView  extends KahaozhanghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KahaozhanghuView(){
	}
 
 	public KahaozhanghuView(KahaozhanghuEntity kahaozhanghuEntity){
 	try {
			BeanUtils.copyProperties(this, kahaozhanghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
