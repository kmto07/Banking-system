package com.dao;

import com.entity.ZhuanzhangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanzhangxinxiVO;
import com.entity.view.ZhuanzhangxinxiView;


/**
 * 转账信息
 * 
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
public interface ZhuanzhangxinxiDao extends BaseMapper<ZhuanzhangxinxiEntity> {
	
	List<ZhuanzhangxinxiVO> selectListVO(@Param("ew") Wrapper<ZhuanzhangxinxiEntity> wrapper);
	
	ZhuanzhangxinxiVO selectVO(@Param("ew") Wrapper<ZhuanzhangxinxiEntity> wrapper);
	
	List<ZhuanzhangxinxiView> selectListView(@Param("ew") Wrapper<ZhuanzhangxinxiEntity> wrapper);

	List<ZhuanzhangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanzhangxinxiEntity> wrapper);
	
	ZhuanzhangxinxiView selectView(@Param("ew") Wrapper<ZhuanzhangxinxiEntity> wrapper);
	

}
