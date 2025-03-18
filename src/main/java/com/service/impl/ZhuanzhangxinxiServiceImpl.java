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


import com.dao.ZhuanzhangxinxiDao;
import com.entity.ZhuanzhangxinxiEntity;
import com.service.ZhuanzhangxinxiService;
import com.entity.vo.ZhuanzhangxinxiVO;
import com.entity.view.ZhuanzhangxinxiView;

@Service("zhuanzhangxinxiService")
public class ZhuanzhangxinxiServiceImpl extends ServiceImpl<ZhuanzhangxinxiDao, ZhuanzhangxinxiEntity> implements ZhuanzhangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanzhangxinxiEntity> page = this.selectPage(
                new Query<ZhuanzhangxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhuanzhangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanzhangxinxiEntity> wrapper) {
		  Page<ZhuanzhangxinxiView> page =new Query<ZhuanzhangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanzhangxinxiVO> selectListVO(Wrapper<ZhuanzhangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanzhangxinxiVO selectVO(Wrapper<ZhuanzhangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanzhangxinxiView> selectListView(Wrapper<ZhuanzhangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanzhangxinxiView selectView(Wrapper<ZhuanzhangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
