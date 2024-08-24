package com.cl.dao;

import com.cl.entity.CantingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CantingxinxiView;


/**
 * 餐厅信息
 * 
 * @author 
 * @email 
 * @date 2024-03-20 16:44:56
 */
public interface CantingxinxiDao extends BaseMapper<CantingxinxiEntity> {
	
	List<CantingxinxiView> selectListView(@Param("ew") Wrapper<CantingxinxiEntity> wrapper);

	List<CantingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CantingxinxiEntity> wrapper);
	
	CantingxinxiView selectView(@Param("ew") Wrapper<CantingxinxiEntity> wrapper);
	

}
