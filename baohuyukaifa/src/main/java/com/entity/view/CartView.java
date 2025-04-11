package com.entity.view;

import com.entity.CartEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 购物车
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cart")
public class CartView extends CartEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 wenhuachanpin
			/**
			* 文化产品名称
			*/
			private String wenhuachanpinName;
			/**
			* 文化产品照片
			*/
			private String wenhuachanpinPhoto;
			/**
			* 文化产品类型
			*/
			private Integer wenhuachanpinTypes;
				/**
				* 文化产品类型的值
				*/
				private String wenhuachanpinValue;
			/**
			* 文化产品库存
			*/
			private Integer wenhuachanpinKucunNumber;
			/**
			* 文化产品原价
			*/
			private Double wenhuachanpinOldMoney;
			/**
			* 现价
			*/
			private Double wenhuachanpinNewMoney;
			/**
			* 文化产品介绍
			*/
			private String wenhuachanpinContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 点击次数
			*/
			private Integer wenhuachanpinClicknum;
			/**
			* 逻辑删除
			*/
			private Integer wenhuachanpinDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public CartView() {

	}

	public CartView(CartEntity cartEntity) {
		try {
			BeanUtils.copyProperties(this, cartEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
































				//级联表的get和set wenhuachanpin
					/**
					* 获取： 文化产品名称
					*/
					public String getWenhuachanpinName() {
						return wenhuachanpinName;
					}
					/**
					* 设置： 文化产品名称
					*/
					public void setWenhuachanpinName(String wenhuachanpinName) {
						this.wenhuachanpinName = wenhuachanpinName;
					}
					/**
					* 获取： 文化产品照片
					*/
					public String getWenhuachanpinPhoto() {
						return wenhuachanpinPhoto;
					}
					/**
					* 设置： 文化产品照片
					*/
					public void setWenhuachanpinPhoto(String wenhuachanpinPhoto) {
						this.wenhuachanpinPhoto = wenhuachanpinPhoto;
					}
					/**
					* 获取： 文化产品类型
					*/
					public Integer getWenhuachanpinTypes() {
						return wenhuachanpinTypes;
					}
					/**
					* 设置： 文化产品类型
					*/
					public void setWenhuachanpinTypes(Integer wenhuachanpinTypes) {
						this.wenhuachanpinTypes = wenhuachanpinTypes;
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
					* 获取： 文化产品库存
					*/
					public Integer getWenhuachanpinKucunNumber() {
						return wenhuachanpinKucunNumber;
					}
					/**
					* 设置： 文化产品库存
					*/
					public void setWenhuachanpinKucunNumber(Integer wenhuachanpinKucunNumber) {
						this.wenhuachanpinKucunNumber = wenhuachanpinKucunNumber;
					}
					/**
					* 获取： 文化产品原价
					*/
					public Double getWenhuachanpinOldMoney() {
						return wenhuachanpinOldMoney;
					}
					/**
					* 设置： 文化产品原价
					*/
					public void setWenhuachanpinOldMoney(Double wenhuachanpinOldMoney) {
						this.wenhuachanpinOldMoney = wenhuachanpinOldMoney;
					}
					/**
					* 获取： 现价
					*/
					public Double getWenhuachanpinNewMoney() {
						return wenhuachanpinNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setWenhuachanpinNewMoney(Double wenhuachanpinNewMoney) {
						this.wenhuachanpinNewMoney = wenhuachanpinNewMoney;
					}
					/**
					* 获取： 文化产品介绍
					*/
					public String getWenhuachanpinContent() {
						return wenhuachanpinContent;
					}
					/**
					* 设置： 文化产品介绍
					*/
					public void setWenhuachanpinContent(String wenhuachanpinContent) {
						this.wenhuachanpinContent = wenhuachanpinContent;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
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
					/**
					* 获取： 点击次数
					*/
					public Integer getWenhuachanpinClicknum() {
						return wenhuachanpinClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setWenhuachanpinClicknum(Integer wenhuachanpinClicknum) {
						this.wenhuachanpinClicknum = wenhuachanpinClicknum;
					}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getWenhuachanpinDelete() {
						return wenhuachanpinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setWenhuachanpinDelete(Integer wenhuachanpinDelete) {
						this.wenhuachanpinDelete = wenhuachanpinDelete;
					}











				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}




}
