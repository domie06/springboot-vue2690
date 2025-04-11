package com.dao;

import com.entity.WenhuachanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenhuachanpinView;

/**
 * 文化产品 Dao 接口
 *
 * @author 
 */
public interface WenhuachanpinDao extends BaseMapper<WenhuachanpinEntity> {

   List<WenhuachanpinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
