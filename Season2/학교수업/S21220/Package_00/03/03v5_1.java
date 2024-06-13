package S21220_00;

import java.util.Scanner;

public class S21220_03v52 {
	public static void main(String[] args) {
		
		String[] s_day;	// 배열 선언
		s_day = new String[5];	// 배열 크기설정
		
		//배열에 값 넣기
		s_day[0] = "(1) 월요일이 좋다";
		s_day[1] = "(2) 화요일이 좋다";
		s_day[2] = "(3) 수요일이 좋다";
		s_day[3] = "(4) 목요일이 좋다";
		s_day[4] = "(5) 금요일이 좋다";
		int menu = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for (int i = 0; i < s_day.length; i++) 
				System.out.println(s_day[i]);
			System.out.println("종아하는 날 선택 (종료 : (0))");
			menu = sc.nextInt();
			if (menu == 0) {
				System.out.println("시스템 종료");
				break;
			} else if (!(1<= menu && menu <= 5)) {
				System.out.println("에러 (1) ~ (5) 의 값중 선택");
				continue;
			}
			System.out.println("선택하신것은 " + s_day[menu-1]);
		}

	}
}
