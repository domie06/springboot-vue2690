package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 文化产品订单
 *
 * @author 
 * @email
 */
@TableName("wenhuachanpin_order")
public class WenhuachanpinOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WenhuachanpinOrderEntity() {

	}

	public WenhuachanpinOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 订单号
     */
    @TableField(value = "wenhuachanpin_order_uuid_number")

    private String wenhuachanpinOrderUuidNumber;


    /**
     * 收获地址
     */
    @TableField(value = "address_id")

    private Integer addressId;


    /**
     * 文化产品
     */
    @TableField(value = "wenhuachanpin_id")

    private Integer wenhuachanpinId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 购买数量
     */
    @TableField(value = "buy_number")

    private Integer buyNumber;


    /**
     * 实付价格
     */
    @TableField(value = "wenhuachanpin_order_true_price")

    private Double wenhuachanpinOrderTruePrice;


    /**
     * 快递公司
     */
    @TableField(value = "wenhuachanpin_order_courier_name")

    private String wenhuachanpinOrderCourierName;


    /**
     * 订单快递单号
     */
    @TableField(value = "wenhuachanpin_order_courier_number")

    private String wenhuachanpinOrderCourierNumber;


    /**
     * 订单类型
     */
    @TableField(value = "wenhuachanpin_order_types")

    private Integer wenhuachanpinOrderTypes;


    /**
     * 支付类型
     */
    @TableField(value = "wenhuachanpin_order_payment_types")

    private Integer wenhuachanpinOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getWenhuachanpinOrderUuidNumber() {
        return wenhuachanpinOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setWenhuachanpinOrderUuidNumber(String wenhuachanpinOrderUuidNumber) {
        this.wenhuachanpinOrderUuidNumber = wenhuachanpinOrderUuidNumber;
    }
    /**
	 * 设置：收获地址
	 */
    public Integer getAddressId() {
        return addressId;
    }


    /**
	 * 获取：收获地址
	 */

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 设置：文化产品
	 */
    public Integer getWenhuachanpinId() {
        return wenhuachanpinId;
    }


    /**
	 * 获取：文化产品
	 */

    public void setWenhuachanpinId(Integer wenhuachanpinId) {
        this.wenhuachanpinId = wenhuachanpinId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getWenhuachanpinOrderTruePrice() {
        return wenhuachanpinOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setWenhuachanpinOrderTruePrice(Double wenhuachanpinOrderTruePrice) {
        this.wenhuachanpinOrderTruePrice = wenhuachanpinOrderTruePrice;
    }
    /**
	 * 设置：快递公司
	 */
    public String getWenhuachanpinOrderCourierName() {
        return wenhuachanpinOrderCourierName;
    }


    /**
	 * 获取：快递公司
	 */

    public void setWenhuachanpinOrderCourierName(String wenhuachanpinOrderCourierName) {
        this.wenhuachanpinOrderCourierName = wenhuachanpinOrderCourierName;
    }
    /**
	 * 设置：订单快递单号
	 */
    public String getWenhuachanpinOrderCourierNumber() {
        return wenhuachanpinOrderCourierNumber;
    }


    /**
	 * 获取：订单快递单号
	 */

    public void setWenhuachanpinOrderCourierNumber(String wenhuachanpinOrderCourierNumber) {
        this.wenhuachanpinOrderCourierNumber = wenhuachanpinOrderCourierNumber;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getWenhuachanpinOrderTypes() {
        return wenhuachanpinOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setWenhuachanpinOrderTypes(Integer wenhuachanpinOrderTypes) {
        this.wenhuachanpinOrderTypes = wenhuachanpinOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getWenhuachanpinOrderPaymentTypes() {
        return wenhuachanpinOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setWenhuachanpinOrderPaymentTypes(Integer wenhuachanpinOrderPaymentTypes) {
        this.wenhuachanpinOrderPaymentTypes = wenhuachanpinOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "WenhuachanpinOrder{" +
            "id=" + id +
            ", wenhuachanpinOrderUuidNumber=" + wenhuachanpinOrderUuidNumber +
            ", addressId=" + addressId +
            ", wenhuachanpinId=" + wenhuachanpinId +
            ", yonghuId=" + yonghuId +
            ", buyNumber=" + buyNumber +
            ", wenhuachanpinOrderTruePrice=" + wenhuachanpinOrderTruePrice +
            ", wenhuachanpinOrderCourierName=" + wenhuachanpinOrderCourierName +
            ", wenhuachanpinOrderCourierNumber=" + wenhuachanpinOrderCourierNumber +
            ", wenhuachanpinOrderTypes=" + wenhuachanpinOrderTypes +
            ", wenhuachanpinOrderPaymentTypes=" + wenhuachanpinOrderPaymentTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
