package com.neuedu.test;

import com.neuedu.entity.Order;
import com.neuedu.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.Arrays;
import java.util.List;

public class OrderMapperTest {

    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                OrderMapperTest.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        SqlSession session = factory.openSession(true);

        //生成接口代理
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);

        //查询所有订单
//        for (Order order : orderMapper. listOrder()) {
//            System.out.println(order);
//        }

        Order orderParam = new Order();
        orderParam.setOrderId("1111");
        orderParam.setStatus(2);

        orderMapper.updateOrder(orderParam);


        List<String> list = Arrays.asList("1111");

        orderMapper.deleteByIds(list);


//        List<Order> orderList = orderMapper.listOrderByParam(orderParam);
//
//        for (Order order : orderList) {
//            System.out.println(order);
//        }







//        List<Order> orderList = orderMapper.listOrder();

//        for (Order order : orderList) {
//            OrderVO orderVO = new OrderVO();
//            orderVO.setOrderId(order.getOrderId());
//            orderVO.setMemberId(order.getMemberId());
//            orderVO.setCreateTime(order.getCreateTime());
//            orderVO.setUpdateTime(order.getUpdateTime());
//            orderVO.setStatus(OrderStatusEnum.getOrderStatusEnum(order.getStatus()));
//
//            orderVOList.add(orderVO);
//
//        }
//
//        for (OrderVO orderVO : orderVOList) {
//            System.out.println(orderVO.getStatus().getMessage());
//        }




        //根据用户id查询订单
//        for (Order order : orderMapper.selectOrderByMemberId(1)) { //1为member_id 的值
//            System.out.println(order);
//        }

        //添加订单
//        Order order = new Order();
//        order.setOrderId("11");
//        order.setMemberId(2);
//        order.setStatus(2);
//        System.out.println(orderMapper.saveOrder(order));

        //根据订单id和用户id修改订单
//        Order order = new Order();
//        order.setOrderId("1111");
//        order.setMemberId(1);
//        order.setStatus(2);
//        System.out.println(orderMapper.updateOrderByMemberId(order));

        //删除订单(订单id)
//        Order order = new Order();
//        order.setOrderId("1111");
//        System.out.println(orderMapper.delectOrderByOrderId(order));

        //删除订单(用户id)
//        Order order = new Order();
//        order.setMemberId(1);
//        System.out.println(orderMapper.delectOrderByMemberId(order));

    }

}
