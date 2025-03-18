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


import com.dao.QukuanxinxiDao;
import com.entity.QukuanxinxiEntity;
import com.service.QukuanxinxiService;
import com.entity.vo.QukuanxinxiVO;
import com.entity.view.QukuanxinxiView;

@Service("qukuanxinxiService")
public class QukuanxinxiServiceImpl extends ServiceImpl<QukuanxinxiDao, QukuanxinxiEntity> implements QukuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QukuanxinxiEntity> page = this.selectPage(
                new Query<QukuanxinxiEntity>(params).getPage(),
                new EntityWrapper<QukuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QukuanxinxiEntity> wrapper) {
		  Page<QukuanxinxiView> page =new Query<QukuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QukuanxinxiVO> selectListVO(Wrapper<QukuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QukuanxinxiVO selectVO(Wrapper<QukuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QukuanxinxiView> selectListView(Wrapper<QukuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QukuanxinxiView selectView(Wrapper<QukuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
