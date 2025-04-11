package com.dao;

import com.entity.WenhuachanpinCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenhuachanpinCollectionView;

/**
 * 文化产品收藏 Dao 接口
 *
 * @author 
 */
public interface WenhuachanpinCollectionDao extends BaseMapper<WenhuachanpinCollectionEntity> {

   List<WenhuachanpinCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
