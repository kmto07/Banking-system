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


import com.dao.KefufankuiDao;
import com.entity.KefufankuiEntity;
import com.service.KefufankuiService;
import com.entity.vo.KefufankuiVO;
import com.entity.view.KefufankuiView;

@Service("kefufankuiService")
public class KefufankuiServiceImpl extends ServiceImpl<KefufankuiDao, KefufankuiEntity> implements KefufankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefufankuiEntity> page = this.selectPage(
                new Query<KefufankuiEntity>(params).getPage(),
                new EntityWrapper<KefufankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefufankuiEntity> wrapper) {
		  Page<KefufankuiView> page =new Query<KefufankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KefufankuiVO> selectListVO(Wrapper<KefufankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KefufankuiVO selectVO(Wrapper<KefufankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KefufankuiView> selectListView(Wrapper<KefufankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefufankuiView selectView(Wrapper<KefufankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
