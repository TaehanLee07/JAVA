package jyt_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
		ResultSet rs = st.executeQuery("select * from pc_emp");
		
		String sql = "insert into PC_menu values (10, '음료', '체리콕', 3000)";
		
		int res = st.executeUpdate(sql);
		System.out.println(res);
	}
}
