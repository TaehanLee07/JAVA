<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ include file="layout/db_connect.jsp"%>

<%
	String sql = "SELECT a.custno, a.custname, " +
        "CASE a.grade " +
        "WHEN 'A' THEN 'VIP' " +
        "WHEN 'B' THEN '일반' " +
        "ELSE '직원' END AS grade, " +
        "SUM(b.price) AS price " +
        "FROM member_tbl_02 a, money_tbl_02 b " +
        "WHERE a.custno = b.custno AND NVL(b.price, 0) > 0 " +
        "GROUP BY a.custno, a.custname, a.grade " +
        "ORDER BY SUM(b.price) DESC";

    PreparedStatement pstmt = con.prepareStatement(sql);
    ResultSet rs = pstmt.executeQuery();
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css?ver=1.1.1">
<title>쇼핑몰 회원관리</title>
</head>
<body>
	<header>
		<jsp:include page="layout/header.jsp"></jsp:include>
	</header>
	<nav>
		<jsp:include page="layout/nav.jsp"></jsp:include>
	</nav>
	<main id="section">
		<h3 class="title">회원매출조회</h3>
		<div class="scroll">
			<table class="table_line">
				<tr>
					<th>회원번호</th>
					<th>회원성명</th>
					<th>고객등급</th>
					<th>매출</th>
				</tr>
				<% 
                boolean hasData = false;
                while(rs.next()) {
                    hasData = true;
                %>
				<tr align="center">
					<td><%= rs.getString("custno") %></td>
					<td><%= rs.getString("custname") %></td>
					<td><%= rs.getString("grade") %></td>
					<td><%= rs.getString("price") %></td>
				</tr>
				<% } 
                if (!hasData) { %>
				<tr>
					<td colspan="4" align="center">데이터가 없습니다.</td>
				</tr>
				<% } %>
			</table>
		</div>
	</main>
	<footer>
		<jsp:include page="layout/footer.jsp"></jsp:include>
	</footer>
</body>
</html>
