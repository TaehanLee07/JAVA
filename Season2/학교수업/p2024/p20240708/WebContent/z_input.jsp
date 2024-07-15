<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ include file="layout/db_connect.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>쇼핑몰 회원관리</title>
    <link rel="stylesheet" href="css/style.css?ver=1.1.1">
    <script type="text/javascript">
        function check_value() {
            var custname = document.forms["data"]["custname"].value;
            if (custname == null || custname == "") {
                alert("회원번호를 입력해 주세요.");
                return false;
            }
            if (!/^\d+$/.test(custname)) {
                alert("회원번호는 숫자여야 합니다.");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <header>
        <jsp:include page="layout/header.jsp"></jsp:include>
    </header>
    
    <nav>
        <jsp:include page="layout/nav.jsp"></jsp:include>
    </nav>
    
    <main id="section">
        <h3 class="title">홈쇼핑 회원 정보 조회</h3>
        <form name="data" action="update_p.jsp" method="post" onsubmit="return check_value()">
            <table class="table_line">
                <tr>
                    <th>회원번호입력</th>
                    <td><input type="text" name="custname" value="" size="10" autofocus></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="조회">
                        <input type="button" value="취소" onclick="history.back();">
                        <input type="button" value="회원목록조회/수정" onclick="location.href='member_list.jsp';">
                    </td>
                </tr>
            </table>
        </form>
    </main>
    <footer>
        <jsp:include page="layout/footer.jsp"></jsp:include>
    </footer>
</body>
</html>
