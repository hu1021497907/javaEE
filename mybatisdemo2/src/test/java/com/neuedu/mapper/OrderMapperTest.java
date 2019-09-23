package com.neuedu.mapper;

import com.neuedu.entity.Order;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class OrderMapperTest {

    @Test
    public void listOrderTest(){
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                com.neuedu.test.OrderMapperTest.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        SqlSession session = factory.openSession(true);

        //生成接口代理
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);

        for (Order order : orderMapper.listOrder()) {
            System.out.println(order);
        }
    }

    @Test
    public void listOrderByParamTest(){
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                com.neuedu.test.OrderMapperTest.class.getClassLoader().getResourceAsStream("mybatis.xml")
        );
        SqlSession session = factory.openSession(true);

        //生成接口代理
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);

        for (Order order : orderMapper.listOrderByParam(null)) {
            System.out.println(order);
        }
    }


}
