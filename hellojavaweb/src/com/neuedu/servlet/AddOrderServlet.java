package com.neuedu.servlet;

import com.neuedu.entity.Order;
import com.neuedu.mapper.OrderMapper;
import com.neuedu.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

public class AddOrderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer status = Integer.parseInt(req.getParameter("status"));
        Integer memberId = Integer.parseInt(req.getParameter("memberId"));

        Order order = new Order();
        order.setOrderId(UUID.randomUUID().toString());
        order.setStatus(status);
        order.setMemberId(memberId);

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        orderMapper.saveOrder(order);



        sqlSession.close();

    }
}
