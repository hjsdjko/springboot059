package com.cl.dao;

import com.cl.entity.CartEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CartView;


/**
 * 购物车
 * 
 * @author 
 * @email 
 * @date 2024-03-20 16:44:57
 */
public interface CartDao extends BaseMapper<CartEntity> {
	
	List<CartView> selectListView(@Param("ew") Wrapper<CartEntity> wrapper);

	List<CartView> selectListView(Pagination page,@Param("ew") Wrapper<CartEntity> wrapper);
	
	CartView selectView(@Param("ew") Wrapper<CartEntity> wrapper);
	

}
