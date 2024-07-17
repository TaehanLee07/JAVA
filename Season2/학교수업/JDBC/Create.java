package jyt_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Create {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		// 1.드라이버 로드
		Class.forName("oracle.jdbc.OracleDriver");
		
		// 2.Connection 객체 만들기
		Connection con = DriverManager.getConnection(url,"sw212", "1234");
		
		// 3. Statement 객체 만들기
		Statement st = con.createStatement();

		// 4. ResultSet 객체 만들기
		ResultSet rs = st.executeQuery("select max(menu_no) from pc_menu");
		
		rs.next();
		
		
		int menu_no = rs.getInt(1)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 추가 페이지입니다. "+menu_no+"번째 ");
				
		System.out.printf("메뉴종류를 입력하세요. ");
		String menu_type = sc.next();
		
		System.out.printf("메뉴명를 입력하세요. ");
		String menu_name = sc.next();
		
		System.out.printf("메뉴가격를 입력하세요. ");
		int menu_price = sc.nextInt();
		
		String sql = "insert into PC_menu values ("
				+menu_no+", '"+
				menu_type+"', '"+
				menu_name+"', "+
				menu_price+")";
		
		int res = st.executeUpdate(sql);
		System.out.println(res);
	}
}
