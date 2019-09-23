package com.neuedu.test;

import com.neuedu.entity.OrderDetail;
import com.neuedu.mapper.OrderDetailMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class OrderDetailMapperTest {

    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                OrderDetailMapperTest.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        SqlSession session = factory.openSession(true);

        OrderDetailMapper orderDetailMapper = session.getMapper(OrderDetailMapper.class);

        //根据订单id查询所有详情
//        for (OrderDetail orderDetail : orderDetailMapper.listDetailByOrderId("1111")) {
//            System.out.println(orderDetail);
//        }

        //根据订单id删除订单详情
//        OrderDetail orderDetail = new OrderDetail();
//        orderDetail.setOrderId("1111");
//        System.out.println(orderDetailMapper.delectDetailByOrderId(orderDetail));

        //增加订单详情
//        OrderDetail orderDetail = new OrderDetail();
//        orderDetail.setOrderId("112");
//        orderDetail.setDetailId("25");
//        orderDetail.setGoodsId(25);
//        orderDetail.setCount(10);
//        System.out.println(orderDetailMapper.saveDetail(orderDetail));


        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("11");
        orderDetail.setDetailId("2222");
        orderDetail.setCount(5);
        System.out.println(orderDetailMapper.updateDetailByMemberId(orderDetail));

    }

}
