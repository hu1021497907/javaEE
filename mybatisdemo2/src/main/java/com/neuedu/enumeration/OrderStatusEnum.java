package com.neuedu.enumeration;

public enum  OrderStatusEnum {
    NOT_PAYED(0,"未支付"),
    PAYED(1,"未支付"),
    CANCEL(2,"已取消"),
    FINSHED(3,"已完成");

    private Integer status;
    private String message;

    OrderStatusEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public static OrderStatusEnum getOrderStatusEnum(Integer code){

        for (OrderStatusEnum value : OrderStatusEnum.values()) {
            if (code.equals(value.getStatus())){
                return value;
            }
        }
        return null;
    }
}
