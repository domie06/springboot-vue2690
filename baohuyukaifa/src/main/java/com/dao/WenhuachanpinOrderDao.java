package com.dao;

import com.entity.WenhuachanpinOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenhuachanpinOrderView;

/**
 * 文化产品订单 Dao 接口
 *
 * @author 
 */
public interface WenhuachanpinOrderDao extends BaseMapper<WenhuachanpinOrderEntity> {

   List<WenhuachanpinOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
