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
 * 景点购票订单
 *
 * @author 
 * @email
 */
@TableName("jingdian_order")
public class JingdianOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingdianOrderEntity() {

	}

	public JingdianOrderEntity(T t) {
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
    @TableField(value = "jingdian_order_uuid_number")

    private String jingdianOrderUuidNumber;


    /**
     * 景点
     */
    @TableField(value = "jingdian_id")

    private Integer jingdianId;


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
    @TableField(value = "jingdian_order_true_price")

    private Double jingdianOrderTruePrice;


    /**
     * 支付类型
     */
    @TableField(value = "jingdian_order_payment_types")

    private Integer jingdianOrderPaymentTypes;


    /**
     * 预定日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "goumai_time")

    private Date goumaiTime;


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
    public String getJingdianOrderUuidNumber() {
        return jingdianOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setJingdianOrderUuidNumber(String jingdianOrderUuidNumber) {
        this.jingdianOrderUuidNumber = jingdianOrderUuidNumber;
    }
    /**
	 * 设置：景点
	 */
    public Integer getJingdianId() {
        return jingdianId;
    }


    /**
	 * 获取：景点
	 */

    public void setJingdianId(Integer jingdianId) {
        this.jingdianId = jingdianId;
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
    public Double getJingdianOrderTruePrice() {
        return jingdianOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setJingdianOrderTruePrice(Double jingdianOrderTruePrice) {
        this.jingdianOrderTruePrice = jingdianOrderTruePrice;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getJingdianOrderPaymentTypes() {
        return jingdianOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setJingdianOrderPaymentTypes(Integer jingdianOrderPaymentTypes) {
        this.jingdianOrderPaymentTypes = jingdianOrderPaymentTypes;
    }
    /**
	 * 设置：预定日期
	 */
    public Date getGoumaiTime() {
        return goumaiTime;
    }


    /**
	 * 获取：预定日期
	 */

    public void setGoumaiTime(Date goumaiTime) {
        this.goumaiTime = goumaiTime;
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
        return "JingdianOrder{" +
            "id=" + id +
            ", jingdianOrderUuidNumber=" + jingdianOrderUuidNumber +
            ", jingdianId=" + jingdianId +
            ", yonghuId=" + yonghuId +
            ", buyNumber=" + buyNumber +
            ", jingdianOrderTruePrice=" + jingdianOrderTruePrice +
            ", jingdianOrderPaymentTypes=" + jingdianOrderPaymentTypes +
            ", goumaiTime=" + goumaiTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
