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


import com.dao.KahaozhanghuDao;
import com.entity.KahaozhanghuEntity;
import com.service.KahaozhanghuService;
import com.entity.vo.KahaozhanghuVO;
import com.entity.view.KahaozhanghuView;

@Service("kahaozhanghuService")
public class KahaozhanghuServiceImpl extends ServiceImpl<KahaozhanghuDao, KahaozhanghuEntity> implements KahaozhanghuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KahaozhanghuEntity> page = this.selectPage(
                new Query<KahaozhanghuEntity>(params).getPage(),
                new EntityWrapper<KahaozhanghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KahaozhanghuEntity> wrapper) {
		  Page<KahaozhanghuView> page =new Query<KahaozhanghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KahaozhanghuVO> selectListVO(Wrapper<KahaozhanghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KahaozhanghuVO selectVO(Wrapper<KahaozhanghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KahaozhanghuView> selectListView(Wrapper<KahaozhanghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KahaozhanghuView selectView(Wrapper<KahaozhanghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
