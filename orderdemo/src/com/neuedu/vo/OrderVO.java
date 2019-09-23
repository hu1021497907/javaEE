package com.neuedu.vo;

import com.neuedu.enumeration.OrderStatusEnum;

import java.util.Date;

public class OrderVO {

    private String orderId;
    private OrderStatusEnum status;

    private Integer memberId;
    private Date createTime;
    private Date updateTime;

    public OrderVO() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OrderStatusEnum status) {
        this.status = status;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "orderId='" + orderId + '\'' +
                ", status=" + status +
                ", memberId=" + memberId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
