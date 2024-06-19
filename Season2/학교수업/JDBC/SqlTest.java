package jyt_jdbc;

import java.sql.*;

public class SqlTest {
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

//-------------------------------------------------------------------------- 걍 자바
			
			System.out.println("emp_no\tname\tjob\tbirth\t\t\ttel\t\taddress\t\t\t\tsal");

			while(rs.next()) {
			    String emp_no = rs.getString("emp_no");
			    String name = rs.getString("name");
			    String job = rs.getString("job");
			    String birth = rs.getString("birth");
			    String tel = rs.getString("tel");
			    String address = rs.getString("address");
			    String sal = rs.getString("sal");

			    System.out.printf("%s\t%s\t%s\t%s\t%s\t%-30s\t%s\n",
			                      emp_no, name, job, birth, tel, address, sal);
			}


		
	}
}
