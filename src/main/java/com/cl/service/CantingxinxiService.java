package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.CantingxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CantingxinxiView;


/**
 * 餐厅信息
 *
 * @author 
 * @email 
 * @date 2024-03-20 16:44:56
 */
public interface CantingxinxiService extends IService<CantingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CantingxinxiView> selectListView(Wrapper<CantingxinxiEntity> wrapper);
   	
   	CantingxinxiView selectView(@Param("ew") Wrapper<CantingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CantingxinxiEntity> wrapper);
   	

}

