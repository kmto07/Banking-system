package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanzhangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanzhangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanzhangxinxiView;


/**
 * 转账信息
 *
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
public interface ZhuanzhangxinxiService extends IService<ZhuanzhangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanzhangxinxiVO> selectListVO(Wrapper<ZhuanzhangxinxiEntity> wrapper);
   	
   	ZhuanzhangxinxiVO selectVO(@Param("ew") Wrapper<ZhuanzhangxinxiEntity> wrapper);
   	
   	List<ZhuanzhangxinxiView> selectListView(Wrapper<ZhuanzhangxinxiEntity> wrapper);
   	
   	ZhuanzhangxinxiView selectView(@Param("ew") Wrapper<ZhuanzhangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanzhangxinxiEntity> wrapper);
   	

}

