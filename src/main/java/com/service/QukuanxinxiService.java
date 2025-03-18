package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QukuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QukuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QukuanxinxiView;


/**
 * 取款信息
 *
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
public interface QukuanxinxiService extends IService<QukuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QukuanxinxiVO> selectListVO(Wrapper<QukuanxinxiEntity> wrapper);
   	
   	QukuanxinxiVO selectVO(@Param("ew") Wrapper<QukuanxinxiEntity> wrapper);
   	
   	List<QukuanxinxiView> selectListView(Wrapper<QukuanxinxiEntity> wrapper);
   	
   	QukuanxinxiView selectView(@Param("ew") Wrapper<QukuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QukuanxinxiEntity> wrapper);
   	

}

