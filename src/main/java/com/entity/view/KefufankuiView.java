package com.entity.view;

import com.entity.KefufankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客服反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-21 16:30:42
 */
@TableName("kefufankui")
public class KefufankuiView  extends KefufankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KefufankuiView(){
	}
 
 	public KefufankuiView(KefufankuiEntity kefufankuiEntity){
 	try {
			BeanUtils.copyProperties(this, kefufankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
