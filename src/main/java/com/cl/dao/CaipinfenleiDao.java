package com.cl.dao;

import com.cl.entity.CaipinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CaipinfenleiView;


/**
 * 菜品分类
 * 
 * @author 
 * @email 
 * @date 2024-03-20 16:44:56
 */
public interface CaipinfenleiDao extends BaseMapper<CaipinfenleiEntity> {
	
	List<CaipinfenleiView> selectListView(@Param("ew") Wrapper<CaipinfenleiEntity> wrapper);

	List<CaipinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<CaipinfenleiEntity> wrapper);
	
	CaipinfenleiView selectView(@Param("ew") Wrapper<CaipinfenleiEntity> wrapper);
	

}
