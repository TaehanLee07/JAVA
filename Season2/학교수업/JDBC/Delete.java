package jyt_jdbc;

import java.sql.*;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) throws Exception {
        
        // 1. 드라이버 로드
        Class.forName("oracle.jdbc.OracleDriver");
        
        // 2. 연결 객체 생성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection con = DriverManager.getConnection(url, "sw212", "1234");
        
        Scanner sc = new Scanner(System.in);
        
        // 메뉴 삭제 페이지입니다.
        System.out.println("메뉴 삭제 페이지입니다.");
        System.out.print("삭제할 메뉴명 입력: ");
        String menuName = sc.nextLine();
        
        // 3. 메뉴 존재 여부 확인
        String checkSql = "SELECT COUNT(*) FROM pc_menu WHERE menu_name = ?";
        PreparedStatement checkPstmt = con.prepareStatement(checkSql);
        checkPstmt.setString(1, menuName);
        
        ResultSet rs = checkPstmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        
        if (count > 0) {
            String deleteSql = "DELETE FROM pc_menu WHERE menu_name = ?";
            PreparedStatement deletePstmt = con.prepareStatement(deleteSql);
            deletePstmt.setString(1, menuName);
            deletePstmt.executeUpdate();
            System.out.println("메뉴 항목이 성공적으로 삭제되었습니다.");
        } else System.out.println("메뉴 항목을 찾을 수 없습니다.");
    }
}
