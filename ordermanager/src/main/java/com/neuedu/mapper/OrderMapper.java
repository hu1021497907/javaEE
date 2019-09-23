package com.neuedu.mapper;

import com.neuedu.entity.Order;

import java.util.List;

public interface OrderMapper {

    List<Order>listOrder();

    int saveOrder(Order order);
}
