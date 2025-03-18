package com.dao;

import com.entity.CunkuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CunkuanxinxiVO;
import com.entity.view.CunkuanxinxiView;


/**
 * 存款信息
 * 
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
public interface CunkuanxinxiDao extends BaseMapper<CunkuanxinxiEntity> {
	
	List<CunkuanxinxiVO> selectListVO(@Param("ew") Wrapper<CunkuanxinxiEntity> wrapper);
	
	CunkuanxinxiVO selectVO(@Param("ew") Wrapper<CunkuanxinxiEntity> wrapper);
	
	List<CunkuanxinxiView> selectListView(@Param("ew") Wrapper<CunkuanxinxiEntity> wrapper);

	List<CunkuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CunkuanxinxiEntity> wrapper);
	
	CunkuanxinxiView selectView(@Param("ew") Wrapper<CunkuanxinxiEntity> wrapper);
	

}
