<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ include file="layout/db_connect.jsp" %>

<%
    try {
        request.setCharacterEncoding("UTF-8");

        String sql = "DELETE FROM member_tbl_02 WHERE custno ="+request.getParameter("custno");
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>쇼핑몰 회원관리</title>
</head>
<body>
    <jsp:forward page="member_list.jsp" />
</body>
</html>
