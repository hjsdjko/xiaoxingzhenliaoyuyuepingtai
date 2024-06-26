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
 * 医生预约挂号订单
 *
 * @author 
 * @email
 */
@TableName("yisheng_order")
public class YishengOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YishengOrderEntity() {

	}

	public YishengOrderEntity(T t) {
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
     * 预约挂号编号
     */
    @TableField(value = "yisheng_order_uuid_number")

    private String yishengOrderUuidNumber;


    /**
     * 医生
     */
    @TableField(value = "yisheng_id")

    private Integer yishengId;


    /**
     * 患者
     */
    @TableField(value = "huanzhe_id")

    private Integer huanzheId;


    /**
     * 实付价格
     */
    @TableField(value = "yisheng_order_true_price")

    private Double yishengOrderTruePrice;


    /**
     * 挂号状态
     */
    @TableField(value = "yisheng_order_types")

    private Integer yishengOrderTypes;


    /**
     * 预约看病日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "kanbing_time")

    private Date kanbingTime;


    /**
     * 看病时间段
     */
    @TableField(value = "shijianduan_types")

    private Integer shijianduanTypes;


    /**
     * 支付类型
     */
    @TableField(value = "yisheng_order_payment_types")

    private Integer yishengOrderPaymentTypes;


    /**
     * 挂号时间
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
	 * 设置：预约挂号编号
	 */
    public String getYishengOrderUuidNumber() {
        return yishengOrderUuidNumber;
    }
    /**
	 * 获取：预约挂号编号
	 */

    public void setYishengOrderUuidNumber(String yishengOrderUuidNumber) {
        this.yishengOrderUuidNumber = yishengOrderUuidNumber;
    }
    /**
	 * 设置：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }
    /**
	 * 获取：医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：患者
	 */
    public Integer getHuanzheId() {
        return huanzheId;
    }
    /**
	 * 获取：患者
	 */

    public void setHuanzheId(Integer huanzheId) {
        this.huanzheId = huanzheId;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getYishengOrderTruePrice() {
        return yishengOrderTruePrice;
    }
    /**
	 * 获取：实付价格
	 */

    public void setYishengOrderTruePrice(Double yishengOrderTruePrice) {
        this.yishengOrderTruePrice = yishengOrderTruePrice;
    }
    /**
	 * 设置：挂号状态
	 */
    public Integer getYishengOrderTypes() {
        return yishengOrderTypes;
    }
    /**
	 * 获取：挂号状态
	 */

    public void setYishengOrderTypes(Integer yishengOrderTypes) {
        this.yishengOrderTypes = yishengOrderTypes;
    }
    /**
	 * 设置：预约看病日期
	 */
    public Date getKanbingTime() {
        return kanbingTime;
    }
    /**
	 * 获取：预约看病日期
	 */

    public void setKanbingTime(Date kanbingTime) {
        this.kanbingTime = kanbingTime;
    }
    /**
	 * 设置：看病时间段
	 */
    public Integer getShijianduanTypes() {
        return shijianduanTypes;
    }
    /**
	 * 获取：看病时间段
	 */

    public void setShijianduanTypes(Integer shijianduanTypes) {
        this.shijianduanTypes = shijianduanTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getYishengOrderPaymentTypes() {
        return yishengOrderPaymentTypes;
    }
    /**
	 * 获取：支付类型
	 */

    public void setYishengOrderPaymentTypes(Integer yishengOrderPaymentTypes) {
        this.yishengOrderPaymentTypes = yishengOrderPaymentTypes;
    }
    /**
	 * 设置：挂号时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：挂号时间
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
        return "YishengOrder{" +
            "id=" + id +
            ", yishengOrderUuidNumber=" + yishengOrderUuidNumber +
            ", yishengId=" + yishengId +
            ", huanzheId=" + huanzheId +
            ", yishengOrderTruePrice=" + yishengOrderTruePrice +
            ", yishengOrderTypes=" + yishengOrderTypes +
            ", kanbingTime=" + kanbingTime +
            ", shijianduanTypes=" + shijianduanTypes +
            ", yishengOrderPaymentTypes=" + yishengOrderPaymentTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
