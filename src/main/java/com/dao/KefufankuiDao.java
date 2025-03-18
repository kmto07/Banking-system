package com.dao;

import com.entity.KefufankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KefufankuiVO;
import com.entity.view.KefufankuiView;


/**
 * 客服反馈
 * 
 * @author 
 * @email 
 * @date 2023-03-21 16:30:42
 */
public interface KefufankuiDao extends BaseMapper<KefufankuiEntity> {
	
	List<KefufankuiVO> selectListVO(@Param("ew") Wrapper<KefufankuiEntity> wrapper);
	
	KefufankuiVO selectVO(@Param("ew") Wrapper<KefufankuiEntity> wrapper);
	
	List<KefufankuiView> selectListView(@Param("ew") Wrapper<KefufankuiEntity> wrapper);

	List<KefufankuiView> selectListView(Pagination page,@Param("ew") Wrapper<KefufankuiEntity> wrapper);
	
	KefufankuiView selectView(@Param("ew") Wrapper<KefufankuiEntity> wrapper);
	

}
