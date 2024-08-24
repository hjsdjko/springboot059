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


import com.cl.dao.AddressDao;
import com.cl.entity.AddressEntity;
import com.cl.service.AddressService;
import com.cl.entity.view.AddressView;

@Service("addressService")
public class AddressServiceImpl extends ServiceImpl<AddressDao, AddressEntity> implements AddressService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AddressEntity> page = this.selectPage(
                new Query<AddressEntity>(params).getPage(),
                new EntityWrapper<AddressEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AddressEntity> wrapper) {
		  Page<AddressView> page =new Query<AddressView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<AddressView> selectListView(Wrapper<AddressEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AddressView selectView(Wrapper<AddressEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
