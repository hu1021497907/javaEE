<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.neuedu.util.MyBatisUtil" %>
<%@ page import="com.neuedu.mapper.OrderMapper" %>
<%@ page import="java.util.List" %>
<%@ page import="com.neuedu.entity.Order" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
        <tr>
            <th>订单状态</th>
            <th>用户</th>
            <th>创建时间</th>
            <th>修改时间</th>
        </tr>
        </thead>
        <tbody>

        <%
            SqlSession sqlSession = MyBatisUtil.getSqlSession();
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            List<Order> orderList = orderMapper.listOrder();
        %>

        <%
            for (Order order : orderList) {
        %>
                <tr>
                    <td><%=order.getStatus()%></td>
                    <td><%=order.getMemberId()%></td>
                    <td><%=order.getCreateTime()%></td>
                    <td><%=order.getUpdateTime()%></td>
                </tr>
        <%
            }
        %>
        </tbody>
    </table>

</body>
</html>
