package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CunkuanxinxiDao;
import com.entity.CunkuanxinxiEntity;
import com.service.CunkuanxinxiService;
import com.entity.vo.CunkuanxinxiVO;
import com.entity.view.CunkuanxinxiView;

@Service("cunkuanxinxiService")
public class CunkuanxinxiServiceImpl extends ServiceImpl<CunkuanxinxiDao, CunkuanxinxiEntity> implements CunkuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CunkuanxinxiEntity> page = this.selectPage(
                new Query<CunkuanxinxiEntity>(params).getPage(),
                new EntityWrapper<CunkuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CunkuanxinxiEntity> wrapper) {
		  Page<CunkuanxinxiView> page =new Query<CunkuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CunkuanxinxiVO> selectListVO(Wrapper<CunkuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CunkuanxinxiVO selectVO(Wrapper<CunkuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CunkuanxinxiView> selectListView(Wrapper<CunkuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CunkuanxinxiView selectView(Wrapper<CunkuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
