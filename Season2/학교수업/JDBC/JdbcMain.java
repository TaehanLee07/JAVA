package jyt_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcMain {

    public static void main(String[] args) throws Exception {
        // DB 연동
        Connection con = DBconnect.getConnection();
        PreparedStatement pstmt; // 아직 어떤 sql문을 사용할 지 모르기 때문에 선언만 함.
        ResultSet rs; // 아직 어떤 sql문을 사용할 지 모르기 때문에 선언만 함.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("SW212 PC방에 오신걸 환영합니다.");
        
        boolean 진행 = true;
        while (진행) {
            // 테이블 선택 (사용자 입력 -> 테이블 선택)
            // 테이블이라는 변수에 테이블명을 저장함.
            // ResultSet -> 컬럼명, 행의 갯수 등등의 정보는 알 수 없음.
            // -> ResultSetMetaData 사용
            
            // 이번 예제에서는 테이블을 정해놓고 함.
            String 테이블명 = "pc_menu";
            
            System.out.println("메뉴를 선택하세요.");
            System.out.print("(1). Create, (2). Read, (3). Update, (4). Delete, (0) Exit >>> ");
            int 선택 = sc.nextInt();
            
            switch (선택) {
                case 1: // (1). Create
                    // menu_no: 기본키 -> 자동 생성
                    String sql1 = "select max(menu_no) from " + 테이블명; // ResultSet으로 했기에 테이블명을 변수로 받아와야란다.
                    pstmt = con.prepareStatement(sql1);
                    rs = pstmt.executeQuery();
                    rs.next();
                    
                    System.out.println(rs.getInt(1) + "번 메뉴의 정보를 입력해주세요.");
                    int 번째 = rs.getInt(1) + 1;
                    
                    String sql2 = "insert into " + 테이블명 + " values(?, ?, ?, ?)";
                    pstmt = con.prepareStatement(sql2);
                    pstmt.setInt(1, 번째);
                                
                    // type 입력 받기
                    System.out.printf("메뉴 타입 : ");
                    pstmt.setString(2, sc.next());
                    
                    // menu_name 입력 받기
                    System.out.printf("메뉴명 : ");
                    pstmt.setString(3, sc.next());    
                    
                    // menu_price 일력 받기 
                    System.out.printf("메뉴가격 : ");
                    pstmt.setInt(4, sc.nextInt());
                    
                    pstmt.executeUpdate();
                    System.out.println("메뉴가 성공적으로 추가되었습니다.");
                    break;
                                
                case 2: // (2). Read
                    String sql3 = "select * from " + 테이블명;
                    pstmt = con.prepareStatement(sql3);
                    rs = pstmt.executeQuery();
                    
                    System.out.println("메뉴 번호 | 메뉴 타입 | 메뉴명 | 메뉴 가격");
                    System.out.println("--------------------------------------");
                    
                    while (rs.next()) {
                        int menuNo = rs.getInt(1);
                        String menuType = rs.getString(2);
                        String menuName = rs.getString(3);
                        int menuPrice = rs.getInt(4);
                        
                        System.out.printf("%d | %s | %s | %d\n", menuNo, menuType, menuName, menuPrice);
                    }
                    break;
                                
                case 3: // (3). Update
                    // Update functionality to be implemented
                    break;
                                
                case 4: // (4). Delete
                    // Delete functionality to be implemented
                    break;

                default: // (1 ~ 4 제외). Exit
                    System.out.println("Bye~");
                    진행 = false;
            }
        }
    }
}
