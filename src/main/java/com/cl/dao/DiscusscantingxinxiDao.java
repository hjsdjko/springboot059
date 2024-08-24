package com.cl.dao;

import com.cl.entity.DiscusscantingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusscantingxinxiView;


/**
 * 餐厅信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-20 16:44:57
 */
public interface DiscusscantingxinxiDao extends BaseMapper<DiscusscantingxinxiEntity> {
	
	List<DiscusscantingxinxiView> selectListView(@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);

	List<DiscusscantingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);
	
	DiscusscantingxinxiView selectView(@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);
	

}
