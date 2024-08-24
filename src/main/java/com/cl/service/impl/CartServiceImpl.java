package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.CartDao;
import com.cl.entity.CartEntity;
import com.cl.service.CartService;
import com.cl.entity.view.CartView;

@Service("cartService")
public class CartServiceImpl extends ServiceImpl<CartDao, CartEntity> implements CartService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CartEntity> page = this.selectPage(
                new Query<CartEntity>(params).getPage(),
                new EntityWrapper<CartEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CartEntity> wrapper) {
		  Page<CartView> page =new Query<CartView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<CartView> selectListView(Wrapper<CartEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CartView selectView(Wrapper<CartEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
