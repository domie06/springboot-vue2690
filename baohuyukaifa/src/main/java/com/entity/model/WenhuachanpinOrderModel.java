package com.entity.model;

import com.entity.WenhuachanpinOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 文化产品订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WenhuachanpinOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String wenhuachanpinOrderUuidNumber;


    /**
     * 收获地址
     */
    private Integer addressId;


    /**
     * 文化产品
     */
    private Integer wenhuachanpinId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 购买数量
     */
    private Integer buyNumber;


    /**
     * 实付价格
     */
    private Double wenhuachanpinOrderTruePrice;


    /**
     * 快递公司
     */
    private String wenhuachanpinOrderCourierName;


    /**
     * 订单快递单号
     */
    private String wenhuachanpinOrderCourierNumber;


    /**
     * 订单类型
     */
    private Integer wenhuachanpinOrderTypes;


    /**
     * 支付类型
     */
    private Integer wenhuachanpinOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：订单号
	 */
    public String getWenhuachanpinOrderUuidNumber() {
        return wenhuachanpinOrderUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setWenhuachanpinOrderUuidNumber(String wenhuachanpinOrderUuidNumber) {
        this.wenhuachanpinOrderUuidNumber = wenhuachanpinOrderUuidNumber;
    }
    /**
	 * 获取：收获地址
	 */
    public Integer getAddressId() {
        return addressId;
    }


    /**
	 * 设置：收获地址
	 */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 获取：文化产品
	 */
    public Integer getWenhuachanpinId() {
        return wenhuachanpinId;
    }


    /**
	 * 设置：文化产品
	 */
    public void setWenhuachanpinId(Integer wenhuachanpinId) {
        this.wenhuachanpinId = wenhuachanpinId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 设置：购买数量
	 */
    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getWenhuachanpinOrderTruePrice() {
        return wenhuachanpinOrderTruePrice;
    }


    /**
	 * 设置：实付价格
	 */
    public void setWenhuachanpinOrderTruePrice(Double wenhuachanpinOrderTruePrice) {
        this.wenhuachanpinOrderTruePrice = wenhuachanpinOrderTruePrice;
    }
    /**
	 * 获取：快递公司
	 */
    public String getWenhuachanpinOrderCourierName() {
        return wenhuachanpinOrderCourierName;
    }


    /**
	 * 设置：快递公司
	 */
    public void setWenhuachanpinOrderCourierName(String wenhuachanpinOrderCourierName) {
        this.wenhuachanpinOrderCourierName = wenhuachanpinOrderCourierName;
    }
    /**
	 * 获取：订单快递单号
	 */
    public String getWenhuachanpinOrderCourierNumber() {
        return wenhuachanpinOrderCourierNumber;
    }


    /**
	 * 设置：订单快递单号
	 */
    public void setWenhuachanpinOrderCourierNumber(String wenhuachanpinOrderCourierNumber) {
        this.wenhuachanpinOrderCourierNumber = wenhuachanpinOrderCourierNumber;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getWenhuachanpinOrderTypes() {
        return wenhuachanpinOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setWenhuachanpinOrderTypes(Integer wenhuachanpinOrderTypes) {
        this.wenhuachanpinOrderTypes = wenhuachanpinOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getWenhuachanpinOrderPaymentTypes() {
        return wenhuachanpinOrderPaymentTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setWenhuachanpinOrderPaymentTypes(Integer wenhuachanpinOrderPaymentTypes) {
        this.wenhuachanpinOrderPaymentTypes = wenhuachanpinOrderPaymentTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
