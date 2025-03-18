package com.dao;

import com.entity.QukuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QukuanxinxiVO;
import com.entity.view.QukuanxinxiView;


/**
 * 取款信息
 * 
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
public interface QukuanxinxiDao extends BaseMapper<QukuanxinxiEntity> {
	
	List<QukuanxinxiVO> selectListVO(@Param("ew") Wrapper<QukuanxinxiEntity> wrapper);
	
	QukuanxinxiVO selectVO(@Param("ew") Wrapper<QukuanxinxiEntity> wrapper);
	
	List<QukuanxinxiView> selectListView(@Param("ew") Wrapper<QukuanxinxiEntity> wrapper);

	List<QukuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QukuanxinxiEntity> wrapper);
	
	QukuanxinxiView selectView(@Param("ew") Wrapper<QukuanxinxiEntity> wrapper);
	

}
