package com.cl.dao;

import com.cl.entity.OrdersEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.OrdersView;


/**
 * 菜品订单
 * 
 * @author 
 * @email 
 * @date 2024-03-20 16:44:57
 */
public interface OrdersDao extends BaseMapper<OrdersEntity> {
	
	List<OrdersView> selectListView(@Param("ew") Wrapper<OrdersEntity> wrapper);

	List<OrdersView> selectListView(Pagination page,@Param("ew") Wrapper<OrdersEntity> wrapper);
	
	OrdersView selectView(@Param("ew") Wrapper<OrdersEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<OrdersEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<OrdersEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<OrdersEntity> wrapper);



}
