package com.neuedu.mapper;

import com.neuedu.entity.Order;

import java.util.List;

public interface OrderMapper {

    List<Order> listOrder();

    List<Order> selectOrderByMemberId(Integer memberId);

    int saveOrder(Order order);

    int updateOrderByMemberId(Order order);

    int delectOrderByOrderId(Order order);

    int delectOrderByMemberId(Order order);

    int updateOrder(Order order);


    int deleteByIds(List<String> ids);




    List<Order>listOrderByParam(Order order);



}
