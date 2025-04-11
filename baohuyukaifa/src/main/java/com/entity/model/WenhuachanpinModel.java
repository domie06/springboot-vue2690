package com.entity.model;

import com.entity.WenhuachanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 文化产品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WenhuachanpinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 点击次数
     */
    private Integer wenhuachanpinClicknum;


    /**
     * 逻辑删除
     */
    private Integer wenhuachanpinDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：文化产品名称
	 */
    public String getWenhuachanpinName() {
        return wenhuachanpinName;
    }


    /**
	 * 设置：文化产品名称
	 */
    public void setWenhuachanpinName(String wenhuachanpinName) {
        this.wenhuachanpinName = wenhuachanpinName;
    }
    /**
	 * 获取：文化产品照片
	 */
    public String getWenhuachanpinPhoto() {
        return wenhuachanpinPhoto;
    }


    /**
	 * 设置：文化产品照片
	 */
    public void setWenhuachanpinPhoto(String wenhuachanpinPhoto) {
        this.wenhuachanpinPhoto = wenhuachanpinPhoto;
    }
    /**
	 * 获取：文化产品类型
	 */
    public Integer getWenhuachanpinTypes() {
        return wenhuachanpinTypes;
    }


    /**
	 * 设置：文化产品类型
	 */
    public void setWenhuachanpinTypes(Integer wenhuachanpinTypes) {
        this.wenhuachanpinTypes = wenhuachanpinTypes;
    }
    /**
	 * 获取：文化产品库存
	 */
    public Integer getWenhuachanpinKucunNumber() {
        return wenhuachanpinKucunNumber;
    }


    /**
	 * 设置：文化产品库存
	 */
    public void setWenhuachanpinKucunNumber(Integer wenhuachanpinKucunNumber) {
        this.wenhuachanpinKucunNumber = wenhuachanpinKucunNumber;
    }
    /**
	 * 获取：文化产品原价
	 */
    public Double getWenhuachanpinOldMoney() {
        return wenhuachanpinOldMoney;
    }


    /**
	 * 设置：文化产品原价
	 */
    public void setWenhuachanpinOldMoney(Double wenhuachanpinOldMoney) {
        this.wenhuachanpinOldMoney = wenhuachanpinOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getWenhuachanpinNewMoney() {
        return wenhuachanpinNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setWenhuachanpinNewMoney(Double wenhuachanpinNewMoney) {
        this.wenhuachanpinNewMoney = wenhuachanpinNewMoney;
    }
    /**
	 * 获取：文化产品介绍
	 */
    public String getWenhuachanpinContent() {
        return wenhuachanpinContent;
    }


    /**
	 * 设置：文化产品介绍
	 */
    public void setWenhuachanpinContent(String wenhuachanpinContent) {
        this.wenhuachanpinContent = wenhuachanpinContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getWenhuachanpinClicknum() {
        return wenhuachanpinClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setWenhuachanpinClicknum(Integer wenhuachanpinClicknum) {
        this.wenhuachanpinClicknum = wenhuachanpinClicknum;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getWenhuachanpinDelete() {
        return wenhuachanpinDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setWenhuachanpinDelete(Integer wenhuachanpinDelete) {
        this.wenhuachanpinDelete = wenhuachanpinDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
