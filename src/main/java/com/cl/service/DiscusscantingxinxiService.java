package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusscantingxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusscantingxinxiView;


/**
 * 餐厅信息评论表
 *
 * @author 
 * @email 
 * @date 2024-03-20 16:44:57
 */
public interface DiscusscantingxinxiService extends IService<DiscusscantingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusscantingxinxiView> selectListView(Wrapper<DiscusscantingxinxiEntity> wrapper);
   	
   	DiscusscantingxinxiView selectView(@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusscantingxinxiEntity> wrapper);
   	

}

