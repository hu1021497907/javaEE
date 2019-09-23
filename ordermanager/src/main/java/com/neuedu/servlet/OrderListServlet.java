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
import java.io.PrintWriter;
import java.util.List;

public class OrderListServlet extends HttpServlet {

    /**
     * 服务器会自动调用这个方法
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.查询数据库 mybatis
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = orderMapper.listOrder();
        //2.数据拼接成页面
        String html = "";
        html += "<!DOCTYPE html>";
        html += "<html lang=\"zh_CN\">";
        html += "<head>";
        html += "<meta charset=\"UTF-8\">";
        html += "<title>Title</title>";
        html += "</head>";
        html += "<body>";
        html += "<table cellspacing=\"0\" border=\"1\">";
        html += "<thead>";
        html += "<tr>";
        html += "<th>"+ "order_id" + "</th>";
        html += "<th>"+ "订单状态" + "</th>";
        html += "<th>"+ "用户id" + "</th>";
        html += "<th>"+ "创建时间" + "</th>";
        html += "<th>"+ "修改时间" + "</th>";
        html += "<th>"+ "增删改" + "</th>";

        html += "</tr>";
        html += "</thead>";

        html += "<tbody>";
        html += "<tr>";
        html += "<form action=\"addorder.html\">";
        html += "<td>" + "<input type=\"text\" name=\"order_id\" placeholder=\"请输入orderId\">" + "</td>";
        html += "<td>"+ "<input type=\"text\" name=\"status\" placeholder=\"请输入status\"> " + "</td>";
        html += "<td>" + "<input type=\"text\" name=\"member\" placeholder=\"请输入memberId\"> " + "</td>";
        html += "<td>" + "</td>";
        html += "<td>" + "</td>";
        html += "<td>" + "<input  type=\"submit\" value=\"增加\">" + "</td>";
        html += "</form>";
        html += "</tr>";

        for (Order order : orderList) {
            html += "<tr>";
            html += "<td align=\"center\">" + order.getOrderId() + "</td>";
            html += "<td align=\"center\">"+ order.getStatus() + "</td>";
            html += "<td align=\"center\">" + order.getMemberId() + "</td>";
            html += "<td align=\"center\">" + order.getCreateTime() + "</td>";
            html += "<td align=\"center\">" + order.getUpdateTime() + "</td>";
            html += "<td>" + "<input  type=\"submit\" value=\"删除\">" + " " + "<input  type=\"submit\" value=\"修改\">" + "</td>";
            html += "</tr>";
        }

        html += "</tbody>";

        html += "</table>";

        html += "</body>";
        html += "</html>";




        //3.将页面发送给浏览器
        //设置响应格式
        //告诉浏览器我给你的是什么
        resp.setContentType("text/html;charset=utf-8");

        //获得指向浏览器的输出流
        PrintWriter out = resp.getWriter();

        out.print(html);

        //4.关闭资源
        out.close();
        sqlSession.close();
    }
}
