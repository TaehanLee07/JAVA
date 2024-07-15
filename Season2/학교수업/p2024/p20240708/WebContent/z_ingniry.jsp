<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ include file="layout/db_connect.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>쇼핑몰 회원 정보 조회 결과</title>
    <link rel="stylesheet" href="css/style.css?ver=1.1.1">
</head>
<body>
    <header>
        <jsp:include page="layout/header.jsp"></jsp:include>
    </header>
    
    <nav>
        <jsp:include page="layout/nav.jsp"></jsp:include>
    </nav>
    
    <main id="section">
        <h3 class="title">회원 정보 조회 결과</h3>
        
        <% 
            String custno = request.getParameter("custno");
            if (custno != null && !custno.isEmpty()) {
                try {
                    // SQL 쿼리 정의
                    String sql = "SELECT a.custno, a.custname, " +
                                 "CASE a.grade " +
                                 "WHEN 'A' THEN 'VIP' " +
                                 "WHEN 'B' THEN '일반' " +
                                 "ELSE '직원' END AS grade, " +
                                 "SUM(b.price) AS price " +
                                 "FROM member_tbl_02 a, money_tbl_02 b " +
                                 "WHERE a.custno = b.custno AND a.custno = ? " +
                                 "GROUP BY a.custno, a.custname, a.grade";
                    
                    // PreparedStatement 생성
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.setInt(1, Integer.parseInt(custno));
                    
                    // 쿼리 실행 및 결과셋 처리
                    ResultSet rs = pstmt.executeQuery();
                    
                    // 조회된 결과가 있으면 결과를 출력
                    if (rs.next()) {
        %>
        <table class="table_line">
            <tr>
                <th>회원번호</th>
                <th>회원성명</th>
                <th>고객등급</th>
                <th>매출</th>
            </tr>
            <tr align="center">
                <td><%= rs.getInt("custno") %></td>
                <td><%= rs.getString("custname") %></td>
                <td><%= rs.getString("grade") %></td>
                <td><%= rs.getInt("price") %></td>
            </tr>
        </table>
        <%
                    } else {
                        // 조회된 결과가 없을 경우 메시지 출력
                        out.println("<p>해당 회원번호의 정보를 찾을 수 없습니다.</p>");
                    }
                    
                    // ResultSet, PreparedStatement 닫기
                    rs.close();
                    pstmt.close();
                    
                } catch (SQLException e) {
                    out.println("<p>데이터베이스 오류가 발생했습니다: " + e.getMessage() + "</p>");
                }
            } else {
                // 회원번호가 입력되지 않았을 경우 메시지 출력
                out.println("<p>회원번호가 입력되지 않았습니다.</p>");
            }
        %>
        <p><a href="z_input.jsp">회원번호 입력 페이지로 돌아가기</a></p>
    </main>
    
    <footer>
        <jsp:include page="layout/footer.jsp"></jsp:include>
    </footer>
</body>
</html>
