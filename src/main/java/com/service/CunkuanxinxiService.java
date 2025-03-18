package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CunkuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CunkuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CunkuanxinxiView;


/**
 * 存款信息
 *
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
public interface CunkuanxinxiService extends IService<CunkuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CunkuanxinxiVO> selectListVO(Wrapper<CunkuanxinxiEntity> wrapper);
   	
   	CunkuanxinxiVO selectVO(@Param("ew") Wrapper<CunkuanxinxiEntity> wrapper);
   	
   	List<CunkuanxinxiView> selectListView(Wrapper<CunkuanxinxiEntity> wrapper);
   	
   	CunkuanxinxiView selectView(@Param("ew") Wrapper<CunkuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CunkuanxinxiEntity> wrapper);
   	

}

