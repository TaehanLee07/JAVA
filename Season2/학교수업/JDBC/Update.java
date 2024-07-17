package jyt_jdbc;

import java.sql.*;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) throws Exception{
		
		// 1. 드라이버 객체 로드
		Class.forName("oracle.jdbc.OracleDriver");
		
		// 2. 연결객체 객체 생성
		String 주소 = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection connection = DriverManager.getConnection(주소, "sw212", "1234");
		
		// 3. 준비상태 객체 생성
		String 쿼리문 = " update PC_MENU "
				+ " set menu_price = ? "
				+ " where menu_no = ? ";
		PreparedStatement pstmt = connection.prepareStatement(쿼리문);

		Scanner sc = new Scanner(System.in);
		System.out.printf("수정할 메뉴번호를 선택하세요. > ");
		int 메뉴번호 = sc.nextInt();
		System.out.printf("수정할 금액을 입력해주세요 > ");
		int 수정된가격 = sc.nextInt();
		
		pstmt.setInt(2, 메뉴번호);
		pstmt.setInt(1, 수정된가격);

		// 4. 실행
		pstmt.executeUpdate();
	}

}
