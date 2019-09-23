<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.neuedu.util.MyBatisUtil" %>
<%@ page import="com.neuedu.mapper.OrderMapper" %>
<%@ page import="com.neuedu.entity.Order" %>
<%@ page import="java.util.UUID" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<%--%>
    <%--Integer status = Integer.parseInt(req.getParameter("status"));--%>
    <%--Integer memberId = Integer.parseInt(req.getParameter("memberId"));--%>
    <%----%>
    <%--Order order = new Order();--%>
    <%--order.setOrderId(UUID.randomUUID().toString());--%>
    <%--order.setStatus(status);--%>
    <%--order.setMemberId(memberId);--%>
    <%----%>
    <%--SqlSession sqlSession = MyBatisUtil.getSqlSession();--%>
    <%--OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);--%>
    <%--orderMapper.saveOrder(order);--%>
<%--%>--%>
    <form action="addorder" method="get">
        订单状态：<input type="text" name="status"><br>
        用户id：<input type="text" name="memberId"><br>
        <input type="submit">
    </form>



</body>
</html>
