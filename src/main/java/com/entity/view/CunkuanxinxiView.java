package com.entity.view;

import com.entity.CunkuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 存款信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
@TableName("cunkuanxinxi")
public class CunkuanxinxiView  extends CunkuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CunkuanxinxiView(){
	}
 
 	public CunkuanxinxiView(CunkuanxinxiEntity cunkuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, cunkuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
