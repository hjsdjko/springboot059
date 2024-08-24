package com.cl.dao;

import com.cl.entity.AddressEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.AddressView;


/**
 * 地址
 * 
 * @author 
 * @email 
 * @date 2024-03-20 16:44:57
 */
public interface AddressDao extends BaseMapper<AddressEntity> {
	
	List<AddressView> selectListView(@Param("ew") Wrapper<AddressEntity> wrapper);

	List<AddressView> selectListView(Pagination page,@Param("ew") Wrapper<AddressEntity> wrapper);
	
	AddressView selectView(@Param("ew") Wrapper<AddressEntity> wrapper);
	

}
