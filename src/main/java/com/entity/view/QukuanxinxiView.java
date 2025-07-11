package com.entity.view;

import com.entity.QukuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 取款信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
@TableName("qukuanxinxi")
public class QukuanxinxiView  extends QukuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QukuanxinxiView(){
	}
 
 	public QukuanxinxiView(QukuanxinxiEntity qukuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, qukuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
