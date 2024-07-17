package jyt_jdbc;

import java.sql.*;
import java.util.Scanner;

public class Delete2 {
    public static void main(String[] args) throws Exception {
        
        // 1. 드라이버 로드
        Class.forName("oracle.jdbc.OracleDriver");
        
        // 2. 연결 객체 생성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection con = DriverManager.getConnection(url, "sw212", "1234");
        
        String query = "select menu_name from pc_menu";
        PreparedStatement pstmt = con.prepareStatement(query);
        
        ResultSet rs = pstmt.executeQuery();
     
        Scanner sc = new Scanner(System.in);
       
        int cnt = 0;
        while(rs.next()) {
            cnt++;
            System.out.printf("%d. %6s \t", cnt, rs.getString(1));
            if (cnt % 5 == 0) System.out.println();
        }
        System.out.println("삭제할 메뉴를 선택하세요. >");
        int choice = sc.nextInt();
        
        String query2 = "delete from pc_menu where menu_no = ?";
        pstmt = con.prepareStatement(query2);
        
        pstmt.setInt(1, choice);
        
        // select 할 때만 executeQuery(), 나머지는 executeUpdate() 사용
        if (pstmt.executeUpdate() == 1) {
            System.out.println(choice + "번 메뉴가 정상적으로 삭제되었습니다.");
        }

    }
}
