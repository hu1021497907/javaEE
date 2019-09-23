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

public class HelloWeb extends HttpServlet {

    /**
     * 你在service方法里处理业务逻辑就可以了
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //生成接口代理
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = orderMapper.listOrder();


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
        html += "<th>"+ "status" + "</th>";
        html += "<th>"+ "member_id" + "</th>";
        html += "<th>"+ "create_time" + "</th>";
        html += "<th>"+ "update_time" + "</th>";
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

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print(html);
        out.close();
        sqlSession.close();



    }


}
