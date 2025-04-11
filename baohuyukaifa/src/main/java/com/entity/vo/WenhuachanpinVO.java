package com.entity.vo;

import com.entity.WenhuachanpinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 文化产品
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wenhuachanpin")
public class WenhuachanpinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 文化产品名称
     */

    @TableField(value = "wenhuachanpin_name")
    private String wenhuachanpinName;


    /**
     * 文化产品照片
     */

    @TableField(value = "wenhuachanpin_photo")
    private String wenhuachanpinPhoto;


    /**
     * 文化产品类型
     */

    @TableField(value = "wenhuachanpin_types")
    private Integer wenhuachanpinTypes;


    /**
     * 文化产品库存
     */

    @TableField(value = "wenhuachanpin_kucun_number")
    private Integer wenhuachanpinKucunNumber;


    /**
     * 文化产品原价
     */

    @TableField(value = "wenhuachanpin_old_money")
    private Double wenhuachanpinOldMoney;


    /**
     * 现价
     */

    @TableField(value = "wenhuachanpin_new_money")
    private Double wenhuachanpinNewMoney;


    /**
     * 文化产品介绍
     */

    @TableField(value = "wenhuachanpin_content")
    private String wenhuachanpinContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 点击次数
     */

    @TableField(value = "wenhuachanpin_clicknum")
    private Integer wenhuachanpinClicknum;


    /**
     * 逻辑删除
     */

    @TableField(value = "wenhuachanpin_delete")
    private Integer wenhuachanpinDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：文化产品名称
	 */
    public String getWenhuachanpinName() {
        return wenhuachanpinName;
    }


    /**
	 * 获取：文化产品名称
	 */

    public void setWenhuachanpinName(String wenhuachanpinName) {
        this.wenhuachanpinName = wenhuachanpinName;
    }
    /**
	 * 设置：文化产品照片
	 */
    public String getWenhuachanpinPhoto() {
        return wenhuachanpinPhoto;
    }


    /**
	 * 获取：文化产品照片
	 */

    public void setWenhuachanpinPhoto(String wenhuachanpinPhoto) {
        this.wenhuachanpinPhoto = wenhuachanpinPhoto;
    }
    /**
	 * 设置：文化产品类型
	 */
    public Integer getWenhuachanpinTypes() {
        return wenhuachanpinTypes;
    }


    /**
	 * 获取：文化产品类型
	 */

    public void setWenhuachanpinTypes(Integer wenhuachanpinTypes) {
        this.wenhuachanpinTypes = wenhuachanpinTypes;
    }
    /**
	 * 设置：文化产品库存
	 */
    public Integer getWenhuachanpinKucunNumber() {
        return wenhuachanpinKucunNumber;
    }


    /**
	 * 获取：文化产品库存
	 */

    public void setWenhuachanpinKucunNumber(Integer wenhuachanpinKucunNumber) {
        this.wenhuachanpinKucunNumber = wenhuachanpinKucunNumber;
    }
    /**
	 * 设置：文化产品原价
	 */
    public Double getWenhuachanpinOldMoney() {
        return wenhuachanpinOldMoney;
    }


    /**
	 * 获取：文化产品原价
	 */

    public void setWenhuachanpinOldMoney(Double wenhuachanpinOldMoney) {
        this.wenhuachanpinOldMoney = wenhuachanpinOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getWenhuachanpinNewMoney() {
        return wenhuachanpinNewMoney;
    }


    /**
	 * 获取：现价
	 */

    public void setWenhuachanpinNewMoney(Double wenhuachanpinNewMoney) {
        this.wenhuachanpinNewMoney = wenhuachanpinNewMoney;
    }
    /**
	 * 设置：文化产品介绍
	 */
    public String getWenhuachanpinContent() {
        return wenhuachanpinContent;
    }


    /**
	 * 获取：文化产品介绍
	 */

    public void setWenhuachanpinContent(String wenhuachanpinContent) {
        this.wenhuachanpinContent = wenhuachanpinContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getWenhuachanpinClicknum() {
        return wenhuachanpinClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setWenhuachanpinClicknum(Integer wenhuachanpinClicknum) {
        this.wenhuachanpinClicknum = wenhuachanpinClicknum;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getWenhuachanpinDelete() {
        return wenhuachanpinDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setWenhuachanpinDelete(Integer wenhuachanpinDelete) {
        this.wenhuachanpinDelete = wenhuachanpinDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
