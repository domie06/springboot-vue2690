package com.entity.view;

import com.entity.WenhuachanpinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 文化产品
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wenhuachanpin")
public class WenhuachanpinView extends WenhuachanpinEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 文化产品类型的值
		*/
		private String wenhuachanpinValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public WenhuachanpinView() {

	}

	public WenhuachanpinView(WenhuachanpinEntity wenhuachanpinEntity) {
		try {
			BeanUtils.copyProperties(this, wenhuachanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 文化产品类型的值
			*/
			public String getWenhuachanpinValue() {
				return wenhuachanpinValue;
			}
			/**
			* 设置： 文化产品类型的值
			*/
			public void setWenhuachanpinValue(String wenhuachanpinValue) {
				this.wenhuachanpinValue = wenhuachanpinValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}
















}
