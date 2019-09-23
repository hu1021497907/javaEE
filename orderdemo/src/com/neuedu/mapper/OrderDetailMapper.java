package com.neuedu.mapper;

import com.neuedu.entity.Order;
import com.neuedu.entity.OrderDetail;

import java.util.List;

public interface OrderDetailMapper {

    List<OrderDetail>listDetailByOrderId(String orderId);

    int delectDetailByOrderId(OrderDetail orderDetail);



    int saveDetail(OrderDetail orderDetail);


    int updateDetailByMemberId(OrderDetail orderDetail);
}
