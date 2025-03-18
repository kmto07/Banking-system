package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KahaozhanghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KahaozhanghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KahaozhanghuView;


/**
 * 卡号账户
 *
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
public interface KahaozhanghuService extends IService<KahaozhanghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KahaozhanghuVO> selectListVO(Wrapper<KahaozhanghuEntity> wrapper);
   	
   	KahaozhanghuVO selectVO(@Param("ew") Wrapper<KahaozhanghuEntity> wrapper);
   	
   	List<KahaozhanghuView> selectListView(Wrapper<KahaozhanghuEntity> wrapper);
   	
   	KahaozhanghuView selectView(@Param("ew") Wrapper<KahaozhanghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KahaozhanghuEntity> wrapper);
   	

}

