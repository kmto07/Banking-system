package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KefufankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KefufankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KefufankuiView;


/**
 * 客服反馈
 *
 * @author 
 * @email 
 * @date 2023-03-21 16:30:42
 */
public interface KefufankuiService extends IService<KefufankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefufankuiVO> selectListVO(Wrapper<KefufankuiEntity> wrapper);
   	
   	KefufankuiVO selectVO(@Param("ew") Wrapper<KefufankuiEntity> wrapper);
   	
   	List<KefufankuiView> selectListView(Wrapper<KefufankuiEntity> wrapper);
   	
   	KefufankuiView selectView(@Param("ew") Wrapper<KefufankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefufankuiEntity> wrapper);
   	

}

