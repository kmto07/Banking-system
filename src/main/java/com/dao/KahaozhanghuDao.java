package com.dao;

import com.entity.KahaozhanghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KahaozhanghuVO;
import com.entity.view.KahaozhanghuView;


/**
 * 卡号账户
 * 
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
public interface KahaozhanghuDao extends BaseMapper<KahaozhanghuEntity> {
	
	List<KahaozhanghuVO> selectListVO(@Param("ew") Wrapper<KahaozhanghuEntity> wrapper);
	
	KahaozhanghuVO selectVO(@Param("ew") Wrapper<KahaozhanghuEntity> wrapper);
	
	List<KahaozhanghuView> selectListView(@Param("ew") Wrapper<KahaozhanghuEntity> wrapper);

	List<KahaozhanghuView> selectListView(Pagination page,@Param("ew") Wrapper<KahaozhanghuEntity> wrapper);
	
	KahaozhanghuView selectView(@Param("ew") Wrapper<KahaozhanghuEntity> wrapper);
	

}
