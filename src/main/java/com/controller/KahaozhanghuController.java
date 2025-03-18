package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KahaozhanghuEntity;
import com.entity.view.KahaozhanghuView;

import com.service.KahaozhanghuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 卡号账户
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-21 16:30:41
 */
@RestController
@RequestMapping("/kahaozhanghu")
public class KahaozhanghuController {
    @Autowired
    private KahaozhanghuService kahaozhanghuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KahaozhanghuEntity kahaozhanghu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			kahaozhanghu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yinxing")) {
			kahaozhanghu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KahaozhanghuEntity> ew = new EntityWrapper<KahaozhanghuEntity>();

		PageUtils page = kahaozhanghuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kahaozhanghu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KahaozhanghuEntity kahaozhanghu, 
		HttpServletRequest request){
        EntityWrapper<KahaozhanghuEntity> ew = new EntityWrapper<KahaozhanghuEntity>();

		PageUtils page = kahaozhanghuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kahaozhanghu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KahaozhanghuEntity kahaozhanghu){
       	EntityWrapper<KahaozhanghuEntity> ew = new EntityWrapper<KahaozhanghuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kahaozhanghu, "kahaozhanghu")); 
        return R.ok().put("data", kahaozhanghuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KahaozhanghuEntity kahaozhanghu){
        EntityWrapper< KahaozhanghuEntity> ew = new EntityWrapper< KahaozhanghuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kahaozhanghu, "kahaozhanghu")); 
		KahaozhanghuView kahaozhanghuView =  kahaozhanghuService.selectView(ew);
		return R.ok("查询卡号账户成功").put("data", kahaozhanghuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KahaozhanghuEntity kahaozhanghu = kahaozhanghuService.selectById(id);
        return R.ok().put("data", kahaozhanghu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KahaozhanghuEntity kahaozhanghu = kahaozhanghuService.selectById(id);
        return R.ok().put("data", kahaozhanghu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KahaozhanghuEntity kahaozhanghu, HttpServletRequest request){
    	kahaozhanghu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kahaozhanghu);
        kahaozhanghuService.insert(kahaozhanghu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KahaozhanghuEntity kahaozhanghu, HttpServletRequest request){
    	kahaozhanghu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kahaozhanghu);
        kahaozhanghuService.insert(kahaozhanghu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KahaozhanghuEntity kahaozhanghu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kahaozhanghu);
        kahaozhanghuService.updateById(kahaozhanghu);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kahaozhanghuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KahaozhanghuEntity> wrapper = new EntityWrapper<KahaozhanghuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yinxing")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = kahaozhanghuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
